/*
 * Copyright 2015, Yahoo Inc.
 * Licensed under the Apache License, Version 2.0
 * See LICENSE file in project root for terms.
 */
package com.yahoo.elide.parsers;

import com.yahoo.elide.core.RequestScope;
import com.yahoo.elide.generated.parsers.CoreParser.QueryContext;

import com.fasterxml.jackson.databind.JsonNode;

import org.apache.commons.lang3.tuple.Pair;

import java.util.function.Supplier;

/**
 * PATCH handler.
 */
public class PatchVisitor extends BaseVisitor {

    /**
     * Constructor.
     *
     * @param requestScope the request scope
     */
    public PatchVisitor(RequestScope requestScope) {
        super(requestScope);
    }

    @Override
    public Supplier<Pair<Integer, JsonNode>> visitQuery(QueryContext ctx) {
        return state.handlePatch();
    }
}
