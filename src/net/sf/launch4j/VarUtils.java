package net.sf.launch4j;

import net.sf.launch4j.config.Config;

public class VarUtils {
    
    	public static String getVariable(Config c, String varName, boolean delete, String defValue)
	{
		String prefix = varName + "=";
		String varValue = defValue;
		String foundLine = null;
		for(String s : c.getVariables())
		{
			if( s.startsWith(prefix))
			{
				foundLine = s;
				varValue = s.substring(prefix.length());
			}
		}
		if(delete && foundLine != null)
		{
			c.getVariables().remove(foundLine);
		}
		return varValue;
	}

}
