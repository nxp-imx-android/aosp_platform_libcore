/*
 * Copyright (c) 2019, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package com.sun.crypto.spec;

import java.security.spec.AlgorithmParameterSpec;

import javax.crypto.spec.PBEParameterSpec;

/**
 * This class specifies the set of parameters used with generation
 * 2 password-based encryption (PBE), as defined in the
 * <a href="http://www.ietf.org/rfc/rfc2898.txt">PKCS #5</a>
 * standard.
 *
 * @author Jan Luehe
 *
 * @since 1.7
 */
public class PBE2ParameterSpec extends PBEParameterSpec {

    private AlgorithmParameterSpec paramSpec = null;

    /**
     * Constructs a parameter set for password-based encryption as defined in
     * the PKCS #5 standard.
     *
     * @param salt the salt. The contents of <code>salt</code> are copied
     * to protect against subsequent modification.
     * @param iterationCount the iteration count.
     * @param paramSpec the cipher algorithm parameter specification.
     * @exception NullPointerException if <code>salt</code> is null.
     *
     * @since 1.8
     */
    public PBE2ParameterSpec(byte[] salt, int iterationCount,
                            AlgorithmParameterSpec paramSpec) {
        super(salt, iterationCount);
        this.paramSpec = paramSpec;
    }

    /**
     * Returns the cipher algorithm parameter specification.
     *
     * @return the parameter specification, or null if none was set.
     *
     * @since 1.8
     */
    public AlgorithmParameterSpec getParameterSpec() {
        return this.paramSpec;
    }

}
