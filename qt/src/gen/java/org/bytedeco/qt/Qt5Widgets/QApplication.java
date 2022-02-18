// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.qt.Qt5Widgets;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.qt.Qt5Core.*;
import static org.bytedeco.qt.global.Qt5Core.*;
import org.bytedeco.qt.Qt5Gui.*;
import static org.bytedeco.qt.global.Qt5Gui.*;

import static org.bytedeco.qt.global.Qt5Widgets.*;

// Parsed from QtWidgets/qapplication.h

@Properties(inherit = org.bytedeco.qt.presets.Qt5Widgets.class)
public class QApplication extends QGuiApplication {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QApplication(Pointer p) { super(p); }

// #ifdef Q_QDOC
    public QApplication(@ByRef IntPointer argc, @Cast("char**") PointerPointer argv) { super((Pointer)null); allocate(argc, argv); }
    private native void allocate(@ByRef IntPointer argc, @Cast("char**") PointerPointer argv);
    public QApplication(@ByRef IntPointer argc, @Cast("char**") @ByPtrPtr BytePointer argv) { super((Pointer)null); allocate(argc, argv); }
    private native void allocate(@ByRef IntPointer argc, @Cast("char**") @ByPtrPtr BytePointer argv);
    public QApplication(@ByRef IntBuffer argc, @Cast("char**") @ByPtrPtr ByteBuffer argv) { super((Pointer)null); allocate(argc, argv); }
    private native void allocate(@ByRef IntBuffer argc, @Cast("char**") @ByPtrPtr ByteBuffer argv);
    public QApplication(@ByRef int[] argc, @Cast("char**") @ByPtrPtr byte[] argv) { super((Pointer)null); allocate(argc, argv); }
    private native void allocate(@ByRef int[] argc, @Cast("char**") @ByPtrPtr byte[] argv);
// #else
// #endif

    public static native QStyle style();
    public static native void setStyle(QStyle arg0);
    public static native QStyle setStyle(@Const @ByRef QString arg0);
    /** enum QApplication::ColorSpec */
    public static final int NormalColor = 0, CustomColor = 1, ManyColor = 2;
// #if QT_DEPRECATED_SINCE(5, 8)
    public static native @Deprecated int colorSpec();
    public static native @Deprecated void setColorSpec(int arg0);
// #endif // QT_DEPRECATED_SINCE(5, 8)
// #if QT_DEPRECATED_SINCE(5, 0)
// #endif
    public static native @ByVal QFont font();
    public static native @ByVal QFont font(@Const QWidget arg0);
    public static native @ByVal QFont font(@Cast("const char*") BytePointer className);
    public static native @ByVal QFont font(String className);
    public static native void setFont(@Const @ByRef QFont arg0, @Cast("const char*") BytePointer className/*=nullptr*/);
    public static native void setFont(@Const @ByRef QFont arg0);
    public static native void setFont(@Const @ByRef QFont arg0, String className/*=nullptr*/);

// #if QT_VERSION < 0x060000 // remove these forwarders in Qt 6
    public static native void setWindowIcon(@Const @ByRef QIcon icon);
    public static native @ByVal QIcon windowIcon();
// #endif

    public static native QWidget activePopupWidget();
    public static native QWidget activeModalWidget();
    public static native QWidget focusWidget();

    public static native QWidget activeWindow();
    public static native void setActiveWindow(QWidget act);
    public static native QWidget widgetAt(int x, int y);
    public static native QWidget topLevelAt(int x, int y);

// #if QT_DEPRECATED_SINCE(5, 0)
// #endif
    public static native void beep();
    public static native void alert(QWidget widget, int duration/*=0*/);
    public static native void alert(QWidget widget);

    public static native void setCursorFlashTime(int arg0);
    public static native int cursorFlashTime();

    public static native void setDoubleClickInterval(int arg0);
    public static native int doubleClickInterval();

    public static native void setKeyboardInputInterval(int arg0);
    public static native int keyboardInputInterval();

// #if QT_CONFIG(wheelevent)
    public static native void setWheelScrollLines(int arg0);
    public static native int wheelScrollLines();
// #endif
// #if QT_DEPRECATED_SINCE(5, 15)
// #endif

    public static native void setStartDragTime(int ms);
    public static native int startDragTime();
    public static native void setStartDragDistance(int l);
    public static native int startDragDistance();

    public static native @Cast("bool") boolean isEffectEnabled(@Cast("Qt::UIEffect") int arg0);
    public static native void setEffectEnabled(@Cast("Qt::UIEffect") int arg0, @Cast("bool") boolean enable/*=true*/);
    public static native void setEffectEnabled(@Cast("Qt::UIEffect") int arg0);

// #if QT_DEPRECATED_SINCE(5, 0)
// #endif

    public static native int exec();
    @Virtual public native @Cast("bool") @Name("notify") boolean _notify(QObject arg0, QEvent arg1);
    public native @ByVal QString styleSheet();
// #ifndef QT_NO_STYLE_STYLESHEET
    public native void setStyleSheet(@Const @ByRef QString sheet);
// #endif
    public native void setAutoSipEnabled(@Cast("const bool") boolean enabled);
    public native @Cast("bool") boolean autoSipEnabled();
    public static native void closeAllWindows();
    public static native void aboutQt();
    @Virtual protected native @Cast("bool") boolean event(QEvent arg0);
}
