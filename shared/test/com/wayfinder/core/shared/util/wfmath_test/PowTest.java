/*******************************************************************************
 * Copyright (c) 1999-2010, Vodafone Group Services
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without 
 * modification, are permitted provided that the following conditions 
 * are met:
 * 
 *     * Redistributions of source code must retain the above copyright 
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above 
 *       copyright notice, this list of conditions and the following 
 *       disclaimer in the documentation and/or other materials provided 
 *       with the distribution.
 *     * Neither the name of Vodafone Group Services nor the names of its 
 *       contributors may be used to endorse or promote products derived 
 *       from this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" 
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE 
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE 
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE 
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR 
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF 
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS 
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN 
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING 
 * IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY 
 * OF SUCH DAMAGE.
 ******************************************************************************/
/*
 * Copyright, Wayfinder Systems AB, 2009
 */

package com.wayfinder.core.shared.util.wfmath_test;

import com.wayfinder.core.shared.util.WFMath;

import junit.framework.TestCase;

public class PowTest extends TestCase {

    private static final double POW_ABS_ERROR = 1E-15;
    
    public void testZeroExponent() {
        assertEquals(1.0, WFMath.pow(10, 0), POW_ABS_ERROR);
    }
    
    public void testZeroQuantity() {
        // in Java positve and negative zero compare as equal
        assertEquals(0.0, WFMath.pow(0, 10), POW_ABS_ERROR);
    }
    
    public void testZeroRaisedToZero() {
        double r;
        try {
            r = WFMath.pow(0.0, 0);
            fail("Expected exception not thrown.");
        } catch (IllegalArgumentException e) {
        }
    }
    
    public void testPositveExponent() {
        assertEquals(1000.0, WFMath.pow(10, 3), POW_ABS_ERROR);
    }
    
    public void testNegativeExponent() {
        assertEquals(1E-3, WFMath.pow(10, -3), POW_ABS_ERROR);
    }
}