#  大图浏览  拖拽缩放退出


PhotoViewer
          .setData(图片链接List<String>)
          .setCurrentPage(现在是哪页)
          .setImgContainer(img的容器 rv/gv/lv)
          .setShowImageViewInterface(object : PhotoViewer.ShowImageViewInterface {
              override fun show(iv: ImageView, url: String) {

                  Glide.with(iv.context).load(url).into(iv)
              }
          })
          .setOnLongClickListener(object : OnLongClickListener{
              override fun onLongClick(view: View) {
                  // 长按图片的逻辑
              }
          })
          .start(this)



PhotoViewer
          .setClickSingleImg(url, iv)   //因为本框架不参与加载图片，所以还是要写回调方法
          .setShowImageViewInterface(object : PhotoViewer.ShowImageViewInterface {
              override fun show(iv: ImageView, url: String) {
                  Glide.with(iv.context).load(url).into(iv)
              }
          })
          .start(this)
