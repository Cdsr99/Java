package ReadText;

public class ler {
		private String name;
		private String path;
		private String text;



		public ler(String path, String text) {
			this.path = path;
			this.text = text;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPath() {
			return path;
		}
		public void setPath(String path) {
			this.path = path;
		}
		public String getText() {
			return text;
		}
		public void setText(String text) {
			this.text = text;
		}

}
