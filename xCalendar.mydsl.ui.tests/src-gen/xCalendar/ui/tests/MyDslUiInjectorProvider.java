/*
 * generated by Xtext 2.22.0
 */
package xCalendar.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import xCalendar.mydsl.ui.internal.MydslActivator;

public class MyDslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return MydslActivator.getInstance().getInjector("xCalendar.MyDsl");
	}

}
