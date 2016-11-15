package examples.basicRouter.containers
import react._
import org.scalajs.dom._
import scalajs.js
import scalajs.js._
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.JSConverters._
import reactRouter.ReactRouter._

import react.xml.XmlToCreatElement
import reactBootstrap.ReactBootstrap._
import reactBootstrap._
import reactRouterBootstrap._
import reactRouterBootstrap.ReactRouterBootstrap._
import scala.scalajs.js.UndefOr
import org.scalajs.dom.raw.HTMLInputElement

import scala.scalajs.js.JSConverters._

@js.native
trait JSPropsApp[P] extends js.Object {
  def key: UndefOr[String] = js.native
  def ref: UndefOr[js.Function] = js.native
  def children: PropsChildren = js.native

}

@ScalaJSDefined
class JSStateApp extends js.Object {
  var selectedKey = ""

}

@ScalaJSDefined
class App1(val props: JSPropsApp[Any]) extends Component[JSPropsApp[Any], JSStateApp](props) {

  def onSelect: js.Function = (eventKey: Event) => {
    println(s"Alert from menu item.\neventKey: $eventKey  }");
    var newState = this.state
    newState.selectedKey = eventKey.target.valueOf().asInstanceOf[HTMLInputElement].value
    setState(newState)
  }
  val red = js.Dynamic.literal("color" -> "red")
  override def componentWillMount: Unit = { this.state = new JSStateApp() {} }
  override def componentWillReceiveProps(nextProps: JSPropsApp[Any], nextContext: js.Any) {}

  @XmlToCreatElement(true)
  override def render(): Any = {
    <div>
      <h1>*** Liste des Applications ***</h1>
      <ul role="nav">
        <li><IndexLink to="/" activeStyle={ red }>Home</IndexLink></li>
        <li><Link to="/boostrapComponents" activeStyle={ red }>BootstrapComponents</Link></li>
      </ul>
      { this.props.children }
    </div>

  }

} 

/*
 
    * 
    *  <Navbar>
      <Nav activeKey={ this.state.selectedKey } onSelect={ onSelect.bind(this) }>
        <IndexLink  to="/">
          <NavItem eventKey="1" activeStyle={ red }>Home</NavItem>
        </IndexLink >
        <Link  to="/boostrapComponents" activeStyle={ red }>
          <NavItem eventKey="2">BootstrapComponents</NavItem>
        </Link >
      </Nav>
    </Navbar>
    */
 