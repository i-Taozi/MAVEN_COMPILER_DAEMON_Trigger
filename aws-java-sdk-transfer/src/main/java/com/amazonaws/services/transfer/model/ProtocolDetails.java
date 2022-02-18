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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The protocol settings that are configured for your server.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ProtocolDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProtocolDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates passive mode, for FTP and FTPS protocols. Enter a single dotted-quad IPv4 address, such as the external
     * IP address of a firewall, router, or load balancer. For example:
     * </p>
     * <p>
     * <code> aws transfer update-server --protocol-details PassiveIp=<i>0.0.0.0</i> </code>
     * </p>
     * <p>
     * Replace <code> <i>0.0.0.0</i> </code> in the example above with the actual IP address you want to use.
     * </p>
     * <note>
     * <p>
     * If you change the <code>PassiveIp</code> value, you must stop and then restart your Transfer server for the
     * change to take effect. For details on using Passive IP (PASV) in a NAT environment, see <a href=
     * "http://aws.amazon.com/blogs/storage/configuring-your-ftps-server-behind-a-firewall-or-nat-with-aws-transfer-family/"
     * >Configuring your FTPS server behind a firewall or NAT with Amazon Web Services Transfer Family</a>.
     * </p>
     * </note>
     */
    private String passiveIp;
    /**
     * <p>
     * A property used with Transfer servers that use the FTPS protocol. TLS Session Resumption provides a mechanism to
     * resume or share a negotiated secret key between the control and data connection for an FTPS session.
     * <code>TlsSessionResumptionMode</code> determines whether or not the server resumes recent, negotiated sessions
     * through a unique session ID. This property is available during <code>CreateServer</code> and
     * <code>UpdateServer</code> calls. If a <code>TlsSessionResumptionMode</code> value is not specified during
     * CreateServer, it is set to <code>ENFORCED</code> by default.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DISABLED</code>: the server does not process TLS session resumption client requests and creates a new TLS
     * session for each request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code>: the server processes and accepts clients that are performing TLS session resumption. The
     * server doesn't reject client data connections that do not perform the TLS session resumption client processing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENFORCED</code>: the server processes and accepts clients that are performing TLS session resumption. The
     * server rejects client data connections that do not perform the TLS session resumption client processing. Before
     * you set the value to <code>ENFORCED</code>, test your clients.
     * </p>
     * <note>
     * <p>
     * Not all FTPS clients perform TLS session resumption. So, if you choose to enforce TLS session resumption, you
     * prevent any connections from FTPS clients that don't perform the protocol negotiation. To determine whether or
     * not you can use the <code>ENFORCED</code> value, you need to test your clients.
     * </p>
     * </note></li>
     * </ul>
     */
    private String tlsSessionResumptionMode;

    /**
     * <p>
     * Indicates passive mode, for FTP and FTPS protocols. Enter a single dotted-quad IPv4 address, such as the external
     * IP address of a firewall, router, or load balancer. For example:
     * </p>
     * <p>
     * <code> aws transfer update-server --protocol-details PassiveIp=<i>0.0.0.0</i> </code>
     * </p>
     * <p>
     * Replace <code> <i>0.0.0.0</i> </code> in the example above with the actual IP address you want to use.
     * </p>
     * <note>
     * <p>
     * If you change the <code>PassiveIp</code> value, you must stop and then restart your Transfer server for the
     * change to take effect. For details on using Passive IP (PASV) in a NAT environment, see <a href=
     * "http://aws.amazon.com/blogs/storage/configuring-your-ftps-server-behind-a-firewall-or-nat-with-aws-transfer-family/"
     * >Configuring your FTPS server behind a firewall or NAT with Amazon Web Services Transfer Family</a>.
     * </p>
     * </note>
     * 
     * @param passiveIp
     *        Indicates passive mode, for FTP and FTPS protocols. Enter a single dotted-quad IPv4 address, such as the
     *        external IP address of a firewall, router, or load balancer. For example: </p>
     *        <p>
     *        <code> aws transfer update-server --protocol-details PassiveIp=<i>0.0.0.0</i> </code>
     *        </p>
     *        <p>
     *        Replace <code> <i>0.0.0.0</i> </code> in the example above with the actual IP address you want to use.
     *        </p>
     *        <note>
     *        <p>
     *        If you change the <code>PassiveIp</code> value, you must stop and then restart your Transfer server for
     *        the change to take effect. For details on using Passive IP (PASV) in a NAT environment, see <a href=
     *        "http://aws.amazon.com/blogs/storage/configuring-your-ftps-server-behind-a-firewall-or-nat-with-aws-transfer-family/"
     *        >Configuring your FTPS server behind a firewall or NAT with Amazon Web Services Transfer Family</a>.
     *        </p>
     */

    public void setPassiveIp(String passiveIp) {
        this.passiveIp = passiveIp;
    }

    /**
     * <p>
     * Indicates passive mode, for FTP and FTPS protocols. Enter a single dotted-quad IPv4 address, such as the external
     * IP address of a firewall, router, or load balancer. For example:
     * </p>
     * <p>
     * <code> aws transfer update-server --protocol-details PassiveIp=<i>0.0.0.0</i> </code>
     * </p>
     * <p>
     * Replace <code> <i>0.0.0.0</i> </code> in the example above with the actual IP address you want to use.
     * </p>
     * <note>
     * <p>
     * If you change the <code>PassiveIp</code> value, you must stop and then restart your Transfer server for the
     * change to take effect. For details on using Passive IP (PASV) in a NAT environment, see <a href=
     * "http://aws.amazon.com/blogs/storage/configuring-your-ftps-server-behind-a-firewall-or-nat-with-aws-transfer-family/"
     * >Configuring your FTPS server behind a firewall or NAT with Amazon Web Services Transfer Family</a>.
     * </p>
     * </note>
     * 
     * @return Indicates passive mode, for FTP and FTPS protocols. Enter a single dotted-quad IPv4 address, such as the
     *         external IP address of a firewall, router, or load balancer. For example: </p>
     *         <p>
     *         <code> aws transfer update-server --protocol-details PassiveIp=<i>0.0.0.0</i> </code>
     *         </p>
     *         <p>
     *         Replace <code> <i>0.0.0.0</i> </code> in the example above with the actual IP address you want to use.
     *         </p>
     *         <note>
     *         <p>
     *         If you change the <code>PassiveIp</code> value, you must stop and then restart your Transfer server for
     *         the change to take effect. For details on using Passive IP (PASV) in a NAT environment, see <a href=
     *         "http://aws.amazon.com/blogs/storage/configuring-your-ftps-server-behind-a-firewall-or-nat-with-aws-transfer-family/"
     *         >Configuring your FTPS server behind a firewall or NAT with Amazon Web Services Transfer Family</a>.
     *         </p>
     */

    public String getPassiveIp() {
        return this.passiveIp;
    }

    /**
     * <p>
     * Indicates passive mode, for FTP and FTPS protocols. Enter a single dotted-quad IPv4 address, such as the external
     * IP address of a firewall, router, or load balancer. For example:
     * </p>
     * <p>
     * <code> aws transfer update-server --protocol-details PassiveIp=<i>0.0.0.0</i> </code>
     * </p>
     * <p>
     * Replace <code> <i>0.0.0.0</i> </code> in the example above with the actual IP address you want to use.
     * </p>
     * <note>
     * <p>
     * If you change the <code>PassiveIp</code> value, you must stop and then restart your Transfer server for the
     * change to take effect. For details on using Passive IP (PASV) in a NAT environment, see <a href=
     * "http://aws.amazon.com/blogs/storage/configuring-your-ftps-server-behind-a-firewall-or-nat-with-aws-transfer-family/"
     * >Configuring your FTPS server behind a firewall or NAT with Amazon Web Services Transfer Family</a>.
     * </p>
     * </note>
     * 
     * @param passiveIp
     *        Indicates passive mode, for FTP and FTPS protocols. Enter a single dotted-quad IPv4 address, such as the
     *        external IP address of a firewall, router, or load balancer. For example: </p>
     *        <p>
     *        <code> aws transfer update-server --protocol-details PassiveIp=<i>0.0.0.0</i> </code>
     *        </p>
     *        <p>
     *        Replace <code> <i>0.0.0.0</i> </code> in the example above with the actual IP address you want to use.
     *        </p>
     *        <note>
     *        <p>
     *        If you change the <code>PassiveIp</code> value, you must stop and then restart your Transfer server for
     *        the change to take effect. For details on using Passive IP (PASV) in a NAT environment, see <a href=
     *        "http://aws.amazon.com/blogs/storage/configuring-your-ftps-server-behind-a-firewall-or-nat-with-aws-transfer-family/"
     *        >Configuring your FTPS server behind a firewall or NAT with Amazon Web Services Transfer Family</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtocolDetails withPassiveIp(String passiveIp) {
        setPassiveIp(passiveIp);
        return this;
    }

    /**
     * <p>
     * A property used with Transfer servers that use the FTPS protocol. TLS Session Resumption provides a mechanism to
     * resume or share a negotiated secret key between the control and data connection for an FTPS session.
     * <code>TlsSessionResumptionMode</code> determines whether or not the server resumes recent, negotiated sessions
     * through a unique session ID. This property is available during <code>CreateServer</code> and
     * <code>UpdateServer</code> calls. If a <code>TlsSessionResumptionMode</code> value is not specified during
     * CreateServer, it is set to <code>ENFORCED</code> by default.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DISABLED</code>: the server does not process TLS session resumption client requests and creates a new TLS
     * session for each request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code>: the server processes and accepts clients that are performing TLS session resumption. The
     * server doesn't reject client data connections that do not perform the TLS session resumption client processing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENFORCED</code>: the server processes and accepts clients that are performing TLS session resumption. The
     * server rejects client data connections that do not perform the TLS session resumption client processing. Before
     * you set the value to <code>ENFORCED</code>, test your clients.
     * </p>
     * <note>
     * <p>
     * Not all FTPS clients perform TLS session resumption. So, if you choose to enforce TLS session resumption, you
     * prevent any connections from FTPS clients that don't perform the protocol negotiation. To determine whether or
     * not you can use the <code>ENFORCED</code> value, you need to test your clients.
     * </p>
     * </note></li>
     * </ul>
     * 
     * @param tlsSessionResumptionMode
     *        A property used with Transfer servers that use the FTPS protocol. TLS Session Resumption provides a
     *        mechanism to resume or share a negotiated secret key between the control and data connection for an FTPS
     *        session. <code>TlsSessionResumptionMode</code> determines whether or not the server resumes recent,
     *        negotiated sessions through a unique session ID. This property is available during
     *        <code>CreateServer</code> and <code>UpdateServer</code> calls. If a <code>TlsSessionResumptionMode</code>
     *        value is not specified during CreateServer, it is set to <code>ENFORCED</code> by default.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DISABLED</code>: the server does not process TLS session resumption client requests and creates a
     *        new TLS session for each request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENABLED</code>: the server processes and accepts clients that are performing TLS session resumption.
     *        The server doesn't reject client data connections that do not perform the TLS session resumption client
     *        processing.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENFORCED</code>: the server processes and accepts clients that are performing TLS session
     *        resumption. The server rejects client data connections that do not perform the TLS session resumption
     *        client processing. Before you set the value to <code>ENFORCED</code>, test your clients.
     *        </p>
     *        <note>
     *        <p>
     *        Not all FTPS clients perform TLS session resumption. So, if you choose to enforce TLS session resumption,
     *        you prevent any connections from FTPS clients that don't perform the protocol negotiation. To determine
     *        whether or not you can use the <code>ENFORCED</code> value, you need to test your clients.
     *        </p>
     *        </note></li>
     * @see TlsSessionResumptionMode
     */

    public void setTlsSessionResumptionMode(String tlsSessionResumptionMode) {
        this.tlsSessionResumptionMode = tlsSessionResumptionMode;
    }

    /**
     * <p>
     * A property used with Transfer servers that use the FTPS protocol. TLS Session Resumption provides a mechanism to
     * resume or share a negotiated secret key between the control and data connection for an FTPS session.
     * <code>TlsSessionResumptionMode</code> determines whether or not the server resumes recent, negotiated sessions
     * through a unique session ID. This property is available during <code>CreateServer</code> and
     * <code>UpdateServer</code> calls. If a <code>TlsSessionResumptionMode</code> value is not specified during
     * CreateServer, it is set to <code>ENFORCED</code> by default.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DISABLED</code>: the server does not process TLS session resumption client requests and creates a new TLS
     * session for each request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code>: the server processes and accepts clients that are performing TLS session resumption. The
     * server doesn't reject client data connections that do not perform the TLS session resumption client processing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENFORCED</code>: the server processes and accepts clients that are performing TLS session resumption. The
     * server rejects client data connections that do not perform the TLS session resumption client processing. Before
     * you set the value to <code>ENFORCED</code>, test your clients.
     * </p>
     * <note>
     * <p>
     * Not all FTPS clients perform TLS session resumption. So, if you choose to enforce TLS session resumption, you
     * prevent any connections from FTPS clients that don't perform the protocol negotiation. To determine whether or
     * not you can use the <code>ENFORCED</code> value, you need to test your clients.
     * </p>
     * </note></li>
     * </ul>
     * 
     * @return A property used with Transfer servers that use the FTPS protocol. TLS Session Resumption provides a
     *         mechanism to resume or share a negotiated secret key between the control and data connection for an FTPS
     *         session. <code>TlsSessionResumptionMode</code> determines whether or not the server resumes recent,
     *         negotiated sessions through a unique session ID. This property is available during
     *         <code>CreateServer</code> and <code>UpdateServer</code> calls. If a <code>TlsSessionResumptionMode</code>
     *         value is not specified during CreateServer, it is set to <code>ENFORCED</code> by default.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DISABLED</code>: the server does not process TLS session resumption client requests and creates a
     *         new TLS session for each request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ENABLED</code>: the server processes and accepts clients that are performing TLS session
     *         resumption. The server doesn't reject client data connections that do not perform the TLS session
     *         resumption client processing.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ENFORCED</code>: the server processes and accepts clients that are performing TLS session
     *         resumption. The server rejects client data connections that do not perform the TLS session resumption
     *         client processing. Before you set the value to <code>ENFORCED</code>, test your clients.
     *         </p>
     *         <note>
     *         <p>
     *         Not all FTPS clients perform TLS session resumption. So, if you choose to enforce TLS session resumption,
     *         you prevent any connections from FTPS clients that don't perform the protocol negotiation. To determine
     *         whether or not you can use the <code>ENFORCED</code> value, you need to test your clients.
     *         </p>
     *         </note></li>
     * @see TlsSessionResumptionMode
     */

    public String getTlsSessionResumptionMode() {
        return this.tlsSessionResumptionMode;
    }

    /**
     * <p>
     * A property used with Transfer servers that use the FTPS protocol. TLS Session Resumption provides a mechanism to
     * resume or share a negotiated secret key between the control and data connection for an FTPS session.
     * <code>TlsSessionResumptionMode</code> determines whether or not the server resumes recent, negotiated sessions
     * through a unique session ID. This property is available during <code>CreateServer</code> and
     * <code>UpdateServer</code> calls. If a <code>TlsSessionResumptionMode</code> value is not specified during
     * CreateServer, it is set to <code>ENFORCED</code> by default.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DISABLED</code>: the server does not process TLS session resumption client requests and creates a new TLS
     * session for each request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code>: the server processes and accepts clients that are performing TLS session resumption. The
     * server doesn't reject client data connections that do not perform the TLS session resumption client processing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENFORCED</code>: the server processes and accepts clients that are performing TLS session resumption. The
     * server rejects client data connections that do not perform the TLS session resumption client processing. Before
     * you set the value to <code>ENFORCED</code>, test your clients.
     * </p>
     * <note>
     * <p>
     * Not all FTPS clients perform TLS session resumption. So, if you choose to enforce TLS session resumption, you
     * prevent any connections from FTPS clients that don't perform the protocol negotiation. To determine whether or
     * not you can use the <code>ENFORCED</code> value, you need to test your clients.
     * </p>
     * </note></li>
     * </ul>
     * 
     * @param tlsSessionResumptionMode
     *        A property used with Transfer servers that use the FTPS protocol. TLS Session Resumption provides a
     *        mechanism to resume or share a negotiated secret key between the control and data connection for an FTPS
     *        session. <code>TlsSessionResumptionMode</code> determines whether or not the server resumes recent,
     *        negotiated sessions through a unique session ID. This property is available during
     *        <code>CreateServer</code> and <code>UpdateServer</code> calls. If a <code>TlsSessionResumptionMode</code>
     *        value is not specified during CreateServer, it is set to <code>ENFORCED</code> by default.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DISABLED</code>: the server does not process TLS session resumption client requests and creates a
     *        new TLS session for each request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENABLED</code>: the server processes and accepts clients that are performing TLS session resumption.
     *        The server doesn't reject client data connections that do not perform the TLS session resumption client
     *        processing.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENFORCED</code>: the server processes and accepts clients that are performing TLS session
     *        resumption. The server rejects client data connections that do not perform the TLS session resumption
     *        client processing. Before you set the value to <code>ENFORCED</code>, test your clients.
     *        </p>
     *        <note>
     *        <p>
     *        Not all FTPS clients perform TLS session resumption. So, if you choose to enforce TLS session resumption,
     *        you prevent any connections from FTPS clients that don't perform the protocol negotiation. To determine
     *        whether or not you can use the <code>ENFORCED</code> value, you need to test your clients.
     *        </p>
     *        </note></li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TlsSessionResumptionMode
     */

    public ProtocolDetails withTlsSessionResumptionMode(String tlsSessionResumptionMode) {
        setTlsSessionResumptionMode(tlsSessionResumptionMode);
        return this;
    }

    /**
     * <p>
     * A property used with Transfer servers that use the FTPS protocol. TLS Session Resumption provides a mechanism to
     * resume or share a negotiated secret key between the control and data connection for an FTPS session.
     * <code>TlsSessionResumptionMode</code> determines whether or not the server resumes recent, negotiated sessions
     * through a unique session ID. This property is available during <code>CreateServer</code> and
     * <code>UpdateServer</code> calls. If a <code>TlsSessionResumptionMode</code> value is not specified during
     * CreateServer, it is set to <code>ENFORCED</code> by default.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DISABLED</code>: the server does not process TLS session resumption client requests and creates a new TLS
     * session for each request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code>: the server processes and accepts clients that are performing TLS session resumption. The
     * server doesn't reject client data connections that do not perform the TLS session resumption client processing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENFORCED</code>: the server processes and accepts clients that are performing TLS session resumption. The
     * server rejects client data connections that do not perform the TLS session resumption client processing. Before
     * you set the value to <code>ENFORCED</code>, test your clients.
     * </p>
     * <note>
     * <p>
     * Not all FTPS clients perform TLS session resumption. So, if you choose to enforce TLS session resumption, you
     * prevent any connections from FTPS clients that don't perform the protocol negotiation. To determine whether or
     * not you can use the <code>ENFORCED</code> value, you need to test your clients.
     * </p>
     * </note></li>
     * </ul>
     * 
     * @param tlsSessionResumptionMode
     *        A property used with Transfer servers that use the FTPS protocol. TLS Session Resumption provides a
     *        mechanism to resume or share a negotiated secret key between the control and data connection for an FTPS
     *        session. <code>TlsSessionResumptionMode</code> determines whether or not the server resumes recent,
     *        negotiated sessions through a unique session ID. This property is available during
     *        <code>CreateServer</code> and <code>UpdateServer</code> calls. If a <code>TlsSessionResumptionMode</code>
     *        value is not specified during CreateServer, it is set to <code>ENFORCED</code> by default.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DISABLED</code>: the server does not process TLS session resumption client requests and creates a
     *        new TLS session for each request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENABLED</code>: the server processes and accepts clients that are performing TLS session resumption.
     *        The server doesn't reject client data connections that do not perform the TLS session resumption client
     *        processing.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENFORCED</code>: the server processes and accepts clients that are performing TLS session
     *        resumption. The server rejects client data connections that do not perform the TLS session resumption
     *        client processing. Before you set the value to <code>ENFORCED</code>, test your clients.
     *        </p>
     *        <note>
     *        <p>
     *        Not all FTPS clients perform TLS session resumption. So, if you choose to enforce TLS session resumption,
     *        you prevent any connections from FTPS clients that don't perform the protocol negotiation. To determine
     *        whether or not you can use the <code>ENFORCED</code> value, you need to test your clients.
     *        </p>
     *        </note></li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TlsSessionResumptionMode
     */

    public ProtocolDetails withTlsSessionResumptionMode(TlsSessionResumptionMode tlsSessionResumptionMode) {
        this.tlsSessionResumptionMode = tlsSessionResumptionMode.toString();
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
        if (getPassiveIp() != null)
            sb.append("PassiveIp: ").append(getPassiveIp()).append(",");
        if (getTlsSessionResumptionMode() != null)
            sb.append("TlsSessionResumptionMode: ").append(getTlsSessionResumptionMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProtocolDetails == false)
            return false;
        ProtocolDetails other = (ProtocolDetails) obj;
        if (other.getPassiveIp() == null ^ this.getPassiveIp() == null)
            return false;
        if (other.getPassiveIp() != null && other.getPassiveIp().equals(this.getPassiveIp()) == false)
            return false;
        if (other.getTlsSessionResumptionMode() == null ^ this.getTlsSessionResumptionMode() == null)
            return false;
        if (other.getTlsSessionResumptionMode() != null && other.getTlsSessionResumptionMode().equals(this.getTlsSessionResumptionMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPassiveIp() == null) ? 0 : getPassiveIp().hashCode());
        hashCode = prime * hashCode + ((getTlsSessionResumptionMode() == null) ? 0 : getTlsSessionResumptionMode().hashCode());
        return hashCode;
    }

    @Override
    public ProtocolDetails clone() {
        try {
            return (ProtocolDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transfer.model.transform.ProtocolDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
