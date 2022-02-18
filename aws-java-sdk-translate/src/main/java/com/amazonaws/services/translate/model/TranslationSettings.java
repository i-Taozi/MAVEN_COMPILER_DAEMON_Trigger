/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.translate.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Settings that configure the translation output.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/TranslationSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TranslationSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Enable the profanity setting if you want Amazon Translate to mask profane words and phrases in your translation
     * output.
     * </p>
     * <p>
     * To mask profane words and phrases, Amazon Translate replaces them with the grawlix string “?$#@$“. This
     * 5-character sequence is used for each profane word or phrase, regardless of the length or number of words.
     * </p>
     * <p>
     * Amazon Translate does not detect profanity in all of its supported languages. For languages that support
     * profanity detection, see <a
     * href="https://docs.aws.amazon.com/translate/latest/dg/what-is.html#what-is-languages">Supported Languages and
     * Language Codes in the Amazon Translate Developer Guide</a>.
     * </p>
     */
    private String profanity;

    /**
     * <p>
     * Enable the profanity setting if you want Amazon Translate to mask profane words and phrases in your translation
     * output.
     * </p>
     * <p>
     * To mask profane words and phrases, Amazon Translate replaces them with the grawlix string “?$#@$“. This
     * 5-character sequence is used for each profane word or phrase, regardless of the length or number of words.
     * </p>
     * <p>
     * Amazon Translate does not detect profanity in all of its supported languages. For languages that support
     * profanity detection, see <a
     * href="https://docs.aws.amazon.com/translate/latest/dg/what-is.html#what-is-languages">Supported Languages and
     * Language Codes in the Amazon Translate Developer Guide</a>.
     * </p>
     * 
     * @param profanity
     *        Enable the profanity setting if you want Amazon Translate to mask profane words and phrases in your
     *        translation output.</p>
     *        <p>
     *        To mask profane words and phrases, Amazon Translate replaces them with the grawlix string “?$#@$“. This
     *        5-character sequence is used for each profane word or phrase, regardless of the length or number of words.
     *        </p>
     *        <p>
     *        Amazon Translate does not detect profanity in all of its supported languages. For languages that support
     *        profanity detection, see <a
     *        href="https://docs.aws.amazon.com/translate/latest/dg/what-is.html#what-is-languages">Supported Languages
     *        and Language Codes in the Amazon Translate Developer Guide</a>.
     * @see Profanity
     */

    public void setProfanity(String profanity) {
        this.profanity = profanity;
    }

    /**
     * <p>
     * Enable the profanity setting if you want Amazon Translate to mask profane words and phrases in your translation
     * output.
     * </p>
     * <p>
     * To mask profane words and phrases, Amazon Translate replaces them with the grawlix string “?$#@$“. This
     * 5-character sequence is used for each profane word or phrase, regardless of the length or number of words.
     * </p>
     * <p>
     * Amazon Translate does not detect profanity in all of its supported languages. For languages that support
     * profanity detection, see <a
     * href="https://docs.aws.amazon.com/translate/latest/dg/what-is.html#what-is-languages">Supported Languages and
     * Language Codes in the Amazon Translate Developer Guide</a>.
     * </p>
     * 
     * @return Enable the profanity setting if you want Amazon Translate to mask profane words and phrases in your
     *         translation output.</p>
     *         <p>
     *         To mask profane words and phrases, Amazon Translate replaces them with the grawlix string “?$#@$“. This
     *         5-character sequence is used for each profane word or phrase, regardless of the length or number of
     *         words.
     *         </p>
     *         <p>
     *         Amazon Translate does not detect profanity in all of its supported languages. For languages that support
     *         profanity detection, see <a
     *         href="https://docs.aws.amazon.com/translate/latest/dg/what-is.html#what-is-languages">Supported Languages
     *         and Language Codes in the Amazon Translate Developer Guide</a>.
     * @see Profanity
     */

    public String getProfanity() {
        return this.profanity;
    }

    /**
     * <p>
     * Enable the profanity setting if you want Amazon Translate to mask profane words and phrases in your translation
     * output.
     * </p>
     * <p>
     * To mask profane words and phrases, Amazon Translate replaces them with the grawlix string “?$#@$“. This
     * 5-character sequence is used for each profane word or phrase, regardless of the length or number of words.
     * </p>
     * <p>
     * Amazon Translate does not detect profanity in all of its supported languages. For languages that support
     * profanity detection, see <a
     * href="https://docs.aws.amazon.com/translate/latest/dg/what-is.html#what-is-languages">Supported Languages and
     * Language Codes in the Amazon Translate Developer Guide</a>.
     * </p>
     * 
     * @param profanity
     *        Enable the profanity setting if you want Amazon Translate to mask profane words and phrases in your
     *        translation output.</p>
     *        <p>
     *        To mask profane words and phrases, Amazon Translate replaces them with the grawlix string “?$#@$“. This
     *        5-character sequence is used for each profane word or phrase, regardless of the length or number of words.
     *        </p>
     *        <p>
     *        Amazon Translate does not detect profanity in all of its supported languages. For languages that support
     *        profanity detection, see <a
     *        href="https://docs.aws.amazon.com/translate/latest/dg/what-is.html#what-is-languages">Supported Languages
     *        and Language Codes in the Amazon Translate Developer Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Profanity
     */

    public TranslationSettings withProfanity(String profanity) {
        setProfanity(profanity);
        return this;
    }

    /**
     * <p>
     * Enable the profanity setting if you want Amazon Translate to mask profane words and phrases in your translation
     * output.
     * </p>
     * <p>
     * To mask profane words and phrases, Amazon Translate replaces them with the grawlix string “?$#@$“. This
     * 5-character sequence is used for each profane word or phrase, regardless of the length or number of words.
     * </p>
     * <p>
     * Amazon Translate does not detect profanity in all of its supported languages. For languages that support
     * profanity detection, see <a
     * href="https://docs.aws.amazon.com/translate/latest/dg/what-is.html#what-is-languages">Supported Languages and
     * Language Codes in the Amazon Translate Developer Guide</a>.
     * </p>
     * 
     * @param profanity
     *        Enable the profanity setting if you want Amazon Translate to mask profane words and phrases in your
     *        translation output.</p>
     *        <p>
     *        To mask profane words and phrases, Amazon Translate replaces them with the grawlix string “?$#@$“. This
     *        5-character sequence is used for each profane word or phrase, regardless of the length or number of words.
     *        </p>
     *        <p>
     *        Amazon Translate does not detect profanity in all of its supported languages. For languages that support
     *        profanity detection, see <a
     *        href="https://docs.aws.amazon.com/translate/latest/dg/what-is.html#what-is-languages">Supported Languages
     *        and Language Codes in the Amazon Translate Developer Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Profanity
     */

    public TranslationSettings withProfanity(Profanity profanity) {
        this.profanity = profanity.toString();
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getProfanity() != null)
            sb.append("Profanity: ").append(getProfanity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TranslationSettings == false)
            return false;
        TranslationSettings other = (TranslationSettings) obj;
        if (other.getProfanity() == null ^ this.getProfanity() == null)
            return false;
        if (other.getProfanity() != null && other.getProfanity().equals(this.getProfanity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProfanity() == null) ? 0 : getProfanity().hashCode());
        return hashCode;
    }

    @Override
    public TranslationSettings clone() {
        try {
            return (TranslationSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.translate.model.transform.TranslationSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
