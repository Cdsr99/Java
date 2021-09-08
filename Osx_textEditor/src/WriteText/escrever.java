package WriteText;

public class escrever {
private String name;
private String path;
private String text;



public escrever(String name, String path, String text) {
	this.name = name;
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
