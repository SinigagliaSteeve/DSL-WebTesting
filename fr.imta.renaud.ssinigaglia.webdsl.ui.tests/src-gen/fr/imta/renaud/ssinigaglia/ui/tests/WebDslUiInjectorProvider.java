/*
 * generated by Xtext 2.12.0
 */
package fr.imta.renaud.ssinigaglia.ui.tests;

import com.google.inject.Injector;
import fr.imta.renaud.ssinigaglia.webdsl.ui.internal.WebdslActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class WebDslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return WebdslActivator.getInstance().getInjector("fr.imta.renaud.ssinigaglia.WebDsl");
	}

}
