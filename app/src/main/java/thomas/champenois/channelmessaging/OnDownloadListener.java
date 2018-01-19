package thomas.champenois.channelmessaging;

/**
 * Created by champent on 19/01/2018.
 */
interface OnDownloadListener {

    public void onDownloadComplete(String downloadedContent);
    public void onDownloadError(String error);
}
