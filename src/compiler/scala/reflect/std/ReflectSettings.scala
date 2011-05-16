package scala.reflect
package std

class ReflectSettings extends common.settings.MutableSettings {

  def newSetting[TT](init: TT) = new SettingValue {
    type T = TT
    def postSetHook() {}
    var v = init
    override def isDefault = v == init
  }

  val debug = newSetting(false)
  val YdepMethTpes = newSetting(false)
  val Ynotnull = newSetting(false)
  val explaintypes = newSetting(false)
  val verbose = newSetting(false)
  val uniqid = newSetting(false)
  val Xprintpos = newSetting(false)
  val printtypes = newSetting(false)
  val Yrecursion = newSetting(0)
  val maxClassfileName = newSetting(255)
}