package it.sieradzki.userscript_parser;

import it.sieradzki.userscript_parser.metadata.ExecuteRules;
import it.sieradzki.userscript_parser.metadata.GrantedApi;
import it.sieradzki.userscript_parser.metadata.RunAt;
import it.sieradzki.userscript_parser.metadata.Version;

import java.net.URL;
import java.util.Set;

/**
 * @see <a href="http://wiki.greasespot.net/Metadata_Block">Metadata Block specification</a>
 */
public class Userscript {

	private String description;

	private URL downloadUrl;

	private ExecuteRules executeRules;

	private GrantedApi grantedApi;

	private URL icon;

	private String name;

	private String namespace;

	private URL updateUrl;

	private Set<URL> require;

	private RunAt runAt;

	private Version version;

	private String code;
}
