/**
 * Copyright (c) 2010-2021 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.radiothermostat.internal.dto;

import com.google.gson.annotations.SerializedName;

/**
 * The {@link RadioThermostatHumidityDTO} is responsible for storing
 * the data from the thermostat 'tstat/remote_temp' JSON response
 *
 * @author Ryan Stevenson - Initial contribution
 */
public class RadioThermostatRemoteDTO {

    @SerializedName("rem_mode")
    private Integer mode;

    @SerializedName("rem_temp")
    private Integer temperature;

    public RadioThermostatRemoteDTO() {
    }

    public Integer getMode() {
        return mode;
    }

    public void setMode(Integer mode) {
        this.mode = mode;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }
}
