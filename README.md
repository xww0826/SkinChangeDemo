# AndroidSkinChange
Android 原生主题换肤案例，一个简单的换肤操作.

## 案例演示
 <img src="https://github.com/xww0826/SkinChangeDemo/blob/master/app/src/main/assets/demo.gif" width = "400" height = "600" alt="图片名称" align=center />
 

## 主题切换

使用 SharedPreferences 保存当前的 Style，然后调用 Activity 的 reCreate() 方法，重新创建新的实例.
Tips:此方式，仅仅只能切换当前主题颜色，局限性太大.若真正做到换肤功能，推荐使用插件式换肤.

## 插件换肤准备工作

- 引入第三方框架：Android-skin-support
- 新建 android project，创建不同的包名.
- 删除不需要的 class,xml 资源，但必须保证 manifest.xml 存在一个 Application.
- Make project,将生成的 debug.apk 文件拷贝到原始项目的 assets/skins 包下，例如命名为（night.skin \ red.skin）

### 插件换肤效果演示
 <img src="https://github.com/xww0826/SkinChangeDemo/blob/master/app/src/main/assets/plug_demo.gif" width = "400" height = "600" alt="图片名称" align=center />

## 作者
- 联系QQ：122265264
- 邮箱：xuweiwei0826@gmail.com
- 博客：https://blog.csdn.net/smile_Running
