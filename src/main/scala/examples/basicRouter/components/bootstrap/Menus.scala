package examples.basicRouter.components.bootstrap

 
import react._
import org.scalajs.dom._
import scalajs.js
import scalajs.js._
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.JSConverters._
import reactRouter._
import reactBootstrap.ReactBootstrap._
import reactBootstrap._
import react.xml.XmlToCreatElement

import scala.scalajs.js.Any.fromString
import scala.scalajs.js.Any.fromUnit
 
@js.native
trait JSPropsMenus[P] extends js.Object {
  def key: UndefOr[String] = js.native
  def ref: UndefOr[js.Function] = js.native
  def children: PropsChildren = js.native

}

@ScalaJSDefined
class Menus(val props:JSPropsMenus[Any]) extends Component[JSPropsMenus[Any], Any](props) {
  override def componentWillMount: Unit = {}
  override def componentWillReceiveProps(nextProps:  JSPropsMenus[Any], nextContext: js.Any) {}
  val onSelectAlert:js.Function=()=> {println("onselectAlert")}

  @XmlToCreatElement
  override def render(): Any = {
    <div>
     <ul className="dropdown-menu open">
      <MenuItem header={true}>Header</MenuItem>
      <MenuItem>link</MenuItem>
      <MenuItem divider={true}/>
      <MenuItem header={true}>Header</MenuItem>
      <MenuItem>link</MenuItem>
      <MenuItem disabled={true}>disabled</MenuItem>
      <MenuItem title="See? I have a title.">
        link with title
      </MenuItem>
      <MenuItem eventKey={1} href="#someHref" onSelect={onSelectAlert.bind(this)}>
        link that alerts
      </MenuItem>
    </ul>
		</div>

  }

}  