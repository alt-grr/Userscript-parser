package it.sieradzki.userscript_parser.metadata;

/**
 * Implementation of <a href="https://developer.mozilla.org/en/Toolkit_version_format">Toolkit version format</a>
 */
public class Version implements Comparable<Version> {

	private Part[] versionParts;

	public Version(String versionString) {
	}

	@Override
	public int compareTo(Version o) {
		return 0;
	}

	private static class Part implements Comparable<Part> {

		private Integer numberA;

		private String stringB;

		private Integer numberC;

		private String stringD;

		@Override
		public int compareTo(Part o) {
			return 0;
		}
	}
}
