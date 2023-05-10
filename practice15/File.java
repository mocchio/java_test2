public class File {
  private String folder;
  private String file;

  // ゲッターとセッター
  public String getFolder() {
    return this.folder;
  }
  public void setFolder(String folder) {
    if (!folder.endsWith("¥")) {
      this.folder = folder + "¥";
    } else {
      this.folder = folder;
    }
  }

  public String getFile() {
    return this.file;
  }
  public void setFile(String file) {
    this.file = file;
  }
}