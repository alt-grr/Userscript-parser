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

		for (int i = 0; i < Math.min(versionParts.length, o.versionParts.length); i++) {

			int comparedPartResult = versionParts[i].compareTo(o.versionParts[i]);
			if (comparedPartResult != 0) {
				return comparedPartResult;
			}
		}

		return versionParts.length - o.versionParts.length;
	}

	private static class Part implements Comparable<Part> {

		private Integer numberA;

		private String stringB;

		private Integer numberC;

		private String stringD;

		@Override
		public int compareTo(Part o) {

			int comparedFieldResult;

			comparedFieldResult = numberA.compareTo(o.numberA);
			if (comparedFieldResult != 0) {
				return comparedFieldResult;
			}

			comparedFieldResult = stringB.compareTo(o.stringB);
			if (comparedFieldResult != 0) {
				return comparedFieldResult;
			}

			comparedFieldResult = numberC.compareTo(o.numberC);
			if (comparedFieldResult != 0) {
				return comparedFieldResult;
			}

			return numberA.compareTo(o.numberA);
		}
	}
}
