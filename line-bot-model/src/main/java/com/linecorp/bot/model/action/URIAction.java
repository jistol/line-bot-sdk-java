/*
 * Copyright (c) 2016 LINE Corporation. All rights reserved.
 * LINE Corporation PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.linecorp.bot.model.action;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import lombok.Getter;

@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("uri")
public class URIAction implements Action {
    private final String label;
    private final String uri;

    @JsonCreator
    public URIAction(
            @JsonProperty("label") String label,
            @JsonProperty("uri") String uri) {
        this.label = label;
        this.uri = uri;
    }
}