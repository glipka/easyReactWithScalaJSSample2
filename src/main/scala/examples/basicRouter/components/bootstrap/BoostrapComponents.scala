package examples.basicRouter.components.bootstrap

import react._
import org.scalajs.dom._
import scalajs.js
import scalajs.js._
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.JSConverters._
import reactRouter._
import reactRouter.ReactRouter._
import react.xml.XmlToCreatElement
import reactRouterBootstrap._
import reactRouterBootstrap.ReactRouterBootstrap._


@js.native
trait JSPropsBootstrapComponents[P] extends js.Object {
  def key: UndefOr[String] = js.native
  def ref: UndefOr[js.Function] = js.native
  def children: PropsChildren = js.native
}

@ScalaJSDefined
class BoostrapComponents(val props: JSPropsBootstrapComponents[Any],val context:Any) extends Component[JSPropsBootstrapComponents[Any], Any](props,context) {
  override def componentWillMount: Unit = {}
  override def componentWillReceiveProps(nextProps: JSPropsBootstrapComponents[Any], nextContext: js.Any) {}
val styleRed=js.Dynamic.literal("color" -> "red")
  @XmlToCreatElement
  override def render(): Any = {
    <div>
      <h3>BootstrapComponents</h3>
      <ul>
        <li><Link to="/boostrapComponents/buttons" activeStyle={ styleRed }>Buttons</Link></li>
        <li><Link to="/boostrapComponents/menus" activeStyle={ styleRed }>Menus</Link></li>
        <li><Link to="/boostrapComponents/modal" activeStyle={ styleRed }>Modal</Link></li>
        <li><Link to="/boostrapComponents/tooltips" activeStyle={ styleRed }>Tooltips</Link></li>
        <li><Link to="/boostrapComponents/navigation" activeStyle={ styleRed }>Navigation</Link></li>
        <li><Link to="/boostrapComponents/pageLayout" activeStyle={ styleRed }>PageLayout</Link></li>
        <li><Link to="/boostrapComponents/forms" activeStyle={ styleRed }>Forms</Link></li>
        <li><Link to="/boostrapComponents/mediaContent" activeStyle={ styleRed }>MediaContent</Link></li>
        <li><Link to="/boostrapComponents/miscellaneous" activeStyle={ styleRed }>Miscellaneoust</Link></li>
      </ul>
      { this.props.children }
    </div>

  }

} 