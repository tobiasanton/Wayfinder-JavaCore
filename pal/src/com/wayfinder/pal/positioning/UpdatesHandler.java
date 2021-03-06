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
 *    Copyright, Wayfinder Systems AB, 2009
 */
package com.wayfinder.pal.positioning;

/**
 * 
 * 
 * 
 *
 */
public interface UpdatesHandler {
    
    public static final int PROVIDER_AVAILABLE = 0;
    public static final int PROVIDER_OUT_OF_SERVICE = 1;
    public static final int PROVIDER_TEMPORARILY_UNAVAILABLE = 2;
    
    /**
     * constant to be used when the value for either speed, course, altitude is missing
     */
    public static final int VALUE_UNDEF = -1;
    
    /**
     * 
     * @param latitudeDeg    the latitude in decimal degrees
     * @param longitudeDeg    the longitude in decimal degrees
     * @param speedMps    speed in m/s
     * @param course    course [0-360)
     * @param altitude    the altitude in meters
     * @param accuracy    the position accuracy, in meters
     * @param timestamp    the time of the position
     */
    public void updatePosition(double latitudeDeg, double longitudeDeg, float speedMps, float course, float altitude, int accuracy, long timestamp);

    /**
     * 
     * @param state    the new provider state
     */
    public void updateState(int state);

}
