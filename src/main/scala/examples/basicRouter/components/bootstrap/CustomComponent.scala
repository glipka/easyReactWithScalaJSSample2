package examples.basicRouter.components.bootstrap

import react._
import org.scalajs.dom._
import scalajs.js
import scalajs.js._
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.JSConverters._
import reactRouter._
import react.xml.XmlToCreatElement



@js.native
trait JSPropsCustomComponent[P] extends js.Object {
  def key: UndefOr[String] = js.native
  def ref: UndefOr[js.Function] = js.native
  def children: PropsChildren = js.native

}
 

@ScalaJSDefined
class CustomComponent(  val props: JSPropsCustomComponent[Any]) extends Component[JSPropsCustomComponent[Any], Any](props) {
  override def componentWillMount: Unit = {}
  override def componentWillReceiveProps(nextProps: JSPropsCustomComponent[Any], nextContext: js.Any) {}

  @XmlToCreatElement
  override def render() : Any = {
       <li
        className="list-group-item"
        onClick={() => {}}>
        {this.props.children}
      </li>

  }

} 