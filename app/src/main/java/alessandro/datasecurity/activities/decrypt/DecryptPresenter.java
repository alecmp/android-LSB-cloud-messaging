package alessandro.datasecurity.activities.decrypt;



interface DecryptPresenter {

  /**
   * Opens a media chooser to select an image from Internal Storage
   * @param path to selected image
   */
  void selectImage(String path);

  /**
   * Interacts with interactor to start decryption process
   */
  void decryptMessage();
}
