package org.eupathdb.websvccommon.wsfplugin.blast;

import java.io.File;

import org.apidb.apicommon.model.ProjectMapper;
import org.gusdb.wsf.plugin.PluginResponse;
import org.gusdb.wsf.plugin.WsfServiceException;

public interface ResultFormatter {

  static final String MACRO_SUMMARY = "BLAST_SUMMARY";
  static final String MACRO_ALIGNMENT = "BLAST_ALIGNMENT";
  static final String newline = System.getProperty("line.separator");

  void setConfig(BlastConfig config);

  void setProjectMapper(ProjectMapper projectMapper);

  /**
   * Format the result into the response, and return the message which can be
   * passed to the client.
   * 
   * @param response
   * @param orderedColumns
   * @param outFile
   * @param recordClass
   * @param dbType
   * @return
   * @throws WsfServiceException
   */
  String formatResult(PluginResponse response, String[] orderedColumns,
      File outFile, String recordClass, String dbType)
      throws WsfServiceException;
}
