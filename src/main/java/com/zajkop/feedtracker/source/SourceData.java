package com.zajkop.feedtracker.source;

import java.util.Collection;
import java.util.List;

class SourceData implements Source {

    @Override
    public Collection<SourceData> fetchRecent() {
        return List.of();
    }
}
