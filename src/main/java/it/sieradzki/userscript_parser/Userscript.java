package it.sieradzki.userscript_parser;

import it.sieradzki.userscript_parser.metadata.ApiFunction;
import it.sieradzki.userscript_parser.metadata.ExecuteRules;
import it.sieradzki.userscript_parser.metadata.RunAt;
import it.sieradzki.userscript_parser.metadata.Version;

import java.net.URL;
import java.util.EnumSet;
import java.util.Set;

/**
 * @see <a href="http://wiki.greasespot.net/Metadata_Block">Metadata Block specification</a>
 * @see <a href="http://wiki.greasespot.net/@grant">@grant specification</a>
 */
public class Userscript {

	public static final String OPENING_TAG = "==UserScript==";

	public static final String CLOSING_TAG = "==/UserScript==";

	// @description
	private String description;

	// @downloadURL
	private URL downloadUrl;

	// @include + @match, @exclude
	private ExecuteRules executeRules;

	// @grant
	private Set<ApiFunction> grantedApiFunctions = EnumSet.noneOf(ApiFunction.class);

	// @icon
	private URL icon;

	// @name
	private String name;

	// @namespace
	private String namespace;

	// @require
	private Set<URL> require;

	// @run-at
	private RunAt runAt;

	// @updateURL
	private URL updateUrl;

	// @version
	private Version version;

	// Source code of userscript
	private String code;
}
