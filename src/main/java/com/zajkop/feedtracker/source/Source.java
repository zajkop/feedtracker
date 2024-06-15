package com.zajkop.feedtracker.source;

import java.util.Collection;

interface Source {

    Collection<SourceData> fetchRecent();
}
