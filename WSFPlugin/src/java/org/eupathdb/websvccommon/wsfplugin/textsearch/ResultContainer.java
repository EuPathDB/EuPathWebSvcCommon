package org.eupathdb.websvccommon.wsfplugin.textsearch;

import org.gusdb.wsf.plugin.WsfServiceException;

public interface ResultContainer {

  void addResult(SearchResult result) throws WsfServiceException;
  
  boolean hasResult(String sourceId);
}
