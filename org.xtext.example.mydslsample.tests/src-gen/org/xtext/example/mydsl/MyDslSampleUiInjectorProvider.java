/*
 * generated by Xtext
 */
package org.xtext.example.mydsl;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class MyDslSampleUiInjectorProvider implements IInjectorProvider {
	
	@Override
	public Injector getInjector() {
		return org.xtext.example.mydsl.ui.internal.MyDslSampleActivator.getInstance().getInjector("org.xtext.example.mydsl.MyDslSample");
	}
	
}
