package org.eupathdb.websvccommon.wsfplugin.blast;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import org.apidb.apicommon.model.ProjectMapper;
import org.gusdb.wdk.model.WdkModelException;
import org.gusdb.wdk.model.WdkUserException;
import org.gusdb.wsf.plugin.PluginResponse;
import org.gusdb.wsf.plugin.WsfServiceException;

public interface ResultFormatter {

  void setConfig(BlastConfig config);

  void setProjectMapper(ProjectMapper projectMapper);

  String formatResult(PluginResponse response, String[] orderedColumns, File outFile, 
      String recordClass, String output) throws IOException,
      WdkModelException, WdkUserException, SQLException, WsfServiceException;
}
