package com.acadgild.android.weatherapp.network;


import com.acadgild.android.weatherapp.utils.CommonUtilities;

/**
 * @author Preetika
 *
 */
public interface OnWebServiceResult {
	public void getWebResponse(String result, CommonUtilities.SERVICE_TYPE type);
}
