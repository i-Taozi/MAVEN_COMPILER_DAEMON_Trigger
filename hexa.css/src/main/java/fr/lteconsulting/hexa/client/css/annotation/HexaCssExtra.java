package fr.lteconsulting.hexa.client.css.annotation;

import fr.lteconsulting.hexa.client.css.bindings.BootstrapHexaCss;

/**
 * This annotation allows to force a CSS class name over
 * the default HexaCss naming convention for a specific method.
 * 
 * This allows to use existing CSS stylesheets.
 * 
 * For example it has been used to bind Bootstrap through
 * HexaCss. See {@link BootstrapHexaCss} for detail on how to use.
 * 
 * @author Arnaud Tournier
 * (c) LTE Consulting - 2015
 * http://www.lteconsulting.fr
 *
 */
public @interface HexaCssExtra
{
	/**
	 * Instead of the CSS class name that would be generated by HexaCss for the annoted method, 
	 * the CSS class name will be forced to the value of this field.
	 * 
	 * Note that obfuscation will still happen.
	 * 
	 * @return The name of the CSS class
	 */
	String name() default "";
}
