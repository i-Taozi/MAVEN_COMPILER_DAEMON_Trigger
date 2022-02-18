/*
 * Copyright 2015-present Open Networking Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.atomix.storage.buffer;

import org.junit.AfterClass;
import org.junit.Test;

import java.io.File;
import java.nio.file.Files;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * File buffer test.
 *
 * @author <a href="http://github.com/kuujo">Jordan Halterman</a>
 */
public class FileBufferTest extends BufferTest {
  @AfterClass
  public static void afterTest() {
    FileTesting.cleanFiles();
  }

  @Override
  protected Buffer createBuffer(int capacity) {
    return FileBuffer.allocate(FileTesting.createFile(), capacity);
  }

  @Override
  protected Buffer createBuffer(int capacity, int maxCapacity) {
    return FileBuffer.allocate(FileTesting.createFile(), capacity, maxCapacity);
  }

  @Test
  public void testFileToHeapBuffer() {
    File file = FileTesting.createFile();
    try (FileBuffer buffer = FileBuffer.allocate(file, 16)) {
      buffer.writeLong(10).writeLong(11).flip();
      byte[] bytes = new byte[16];
      buffer.read(bytes).rewind();
      HeapBuffer heapBuffer = HeapBuffer.wrap(bytes);
      assertEquals(buffer.readLong(), heapBuffer.readLong());
      assertEquals(buffer.readLong(), heapBuffer.readLong());
    }
  }

  /**
   * Rests reopening a file that has been closed.
   */
  @Test
  public void testPersist() {
    File file = FileTesting.createFile();
    try (FileBuffer buffer = FileBuffer.allocate(file, 16)) {
      buffer.writeLong(10).writeLong(11).flip();
      assertEquals(10, buffer.readLong());
      assertEquals(11, buffer.readLong());
    }
    try (FileBuffer buffer = FileBuffer.allocate(file, 16)) {
      assertEquals(10, buffer.readLong());
      assertEquals(11, buffer.readLong());
    }
  }

  /**
   * Tests deleting a file.
   */
  @Test
  public void testDelete() {
    File file = FileTesting.createFile();
    FileBuffer buffer = FileBuffer.allocate(file, 16);
    buffer.writeLong(10).writeLong(11).flip();
    assertEquals(10, buffer.readLong());
    assertEquals(11, buffer.readLong());
    assertTrue(Files.exists(file.toPath()));
    buffer.delete();
    assertFalse(Files.exists(file.toPath()));
  }

}
