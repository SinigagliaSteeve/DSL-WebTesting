/*
 * generated by Xtext 2.12.0
 */
package fr.imta.renaud.ssinigaglia


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class WebDslStandaloneSetup extends WebDslStandaloneSetupGenerated {

	def static void doSetup() {
		new WebDslStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}