package org.sombrenuit.BackbuttonOverridePlugin;

import org.json.JSONArray;
import org.json.JSONException;

import android.content.Intent;
import android.util.Log;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;

public class BackbuttonOverridePlugin extends CordovaPlugin {

	private static final String LOG_TAG = "BackbuttonOverridePlugin";
	private CallbackContext context;

	CordovaInterface cordova;
	CordovaWebView webView;

	public void initialize(CordovaInterface cordova, CordovaWebView webView) {
		super.initialize(cordova, webView);
		this.cordova = cordova;
		this.webView = webView;
        Log.d(TAG,"Init BackbuttonOverridePlugin");
    }

	@Override
	public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
		if ("overrideBackButton".equals(action)) {
			context = callbackContext;
			callbackContext.success();
			return true;
		}

		Log.e(LOG_TAG, "Called invalid action: "+action);
		return false;
	}

	@Override
	public Object onMessage(String id, Object data) 
	{
		if(id.equals("onBackPressedOverride") && context != null)
		{
			PluginResult pluginResult = new PluginResult(PluginResult.Status.OK, "");
            pluginResult.setKeepCallback(true);
			content.sendPluginResult(pluginResult);
			return Boolean.TRUE;
		}	
		return null;
    }
}