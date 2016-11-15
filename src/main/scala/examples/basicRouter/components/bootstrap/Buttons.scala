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
trait JSPropsButtons[P] extends js.Object {
  def key: UndefOr[String] = js.native
  def ref: UndefOr[js.Function] = js.native
  def children: PropsChildren = js.native

}

@ScalaJSDefined
class Buttons(val props: JSPropsButtons[Any]) extends Component[JSPropsButtons[Any], Any](props) {
  override def componentWillMount: Unit = {}
  override def componentWillReceiveProps(nextProps: JSPropsButtons[Any], nextContext: js.Any) {}
  val onSelectAlert: js.Function = (eventKey: String) => {
    println(s"Alert from menu item.\neventKey: ${eventKey}");
  }
  val ListButtons = js.Array(("Default", 0), ("Primary", 1), ("Success", 2), ("Info", 3), ("Warning", 4), ("Danger", 5), ("Link", 6))

  @XmlToCreatElement(true)
  val renderDropdownButton: js.Function2[String, Int, Any] = (title: String, i: Int) => {
    <DropdownButton bsStyle={ title.toLowerCase() } title={ title } key={ i } id={ "dropdown-basic-" + i.toString() }>
      <MenuItem eventKey="1">Action</MenuItem>
      <MenuItem eventKey="2">Another action</MenuItem>
      <MenuItem eventKey="3" active={ true }>Active Item</MenuItem>
      <MenuItem divider={ true }/>
      <MenuItem eventKey="4">Separated link</MenuItem>
    </DropdownButton>

  }

  @XmlToCreatElement
  override def render(): Any = {
    <div>
      <h3>Buttons</h3>
      <ButtonGroup>
        <DropdownButton id="dropdwn1" bsStyle="success" title="Dropdown">
          <MenuItem key="1">Dropdown link</MenuItem>
          <MenuItem key="2">Dropdown link</MenuItem>
        </DropdownButton>
        <Button bsStyle="danger">Middle</Button>
        <Button bsStyle="warning">Right</Button>
      </ButtonGroup>
      <p></p>
      <div>
        <p>Fancy larger or smaller buttons? Add bsSize="large", bsSize="small", or bsSize="xsmall" for additional sizes.</p>
        <ButtonToolbar>
          <Button bsStyle="primary" bsSize="large">Large button</Button>
          <Button bsSize="large">Large button</Button>
        </ButtonToolbar>
        <ButtonToolbar>
          <Button bsStyle="primary">Default button</Button>
          <Button>Default button</Button>
        </ButtonToolbar>
        <ButtonToolbar>
          <Button bsStyle="primary" bsSize="small">Small button</Button>
          <Button bsSize="small">Small button</Button>
        </ButtonToolbar>
        <ButtonToolbar>
          <Button bsStyle="primary" bsSize="xsmall">Extra small button</Button>
          <Button bsSize="xsmall">Extra small button</Button>
        </ButtonToolbar>
      </div>
      <p> </p>
      <ButtonToolbar>
        <Button>Default</Button>
        <Button bsStyle="primary" disabled={ true }>Primary</Button>
        <Button bsStyle="success">Success</Button>
        <Button bsStyle="info">Info</Button>
        <Button bsStyle="warning">Warning</Button>
        <Button bsStyle="danger">Danger</Button>
        <Button bsStyle="link">Link</Button>
      </ButtonToolbar>
      <p></p>
      <ButtonToolbar>
        <Button bsStyle="primary" bsSize="large" active="active">Primary button </Button>
        <Button bsSize="large" active="active">button</Button>
      </ButtonToolbar>
      <p></p>
      <ButtonToolbar>
        <Button href="#">Link</Button>
        <Button>Button</Button>
      </ButtonToolbar>
      <p></p>
      <ButtonToolbar>
        <ButtonGroup>
          <Button>1</Button>
          <Button>2</Button>
          <Button>3</Button>
          <Button>4</Button>
        </ButtonGroup>
        <ButtonGroup>
          <Button>5</Button>
          <Button>6</Button>
          <Button>7</Button>
        </ButtonGroup>
        <ButtonGroup>
          <Button>8</Button>
        </ButtonGroup>
      </ButtonToolbar>
      <p></p>
      <div>
        <ButtonToolbar>
          <ButtonGroup bsSize="large">
            <Button>Left</Button>
            <Button>Middle</Button>
            <Button>Right</Button>
          </ButtonGroup>
        </ButtonToolbar>
        <ButtonToolbar>
          <ButtonGroup>
            <Button>Left</Button>
            <Button>Middle</Button>
            <Button>Right</Button>
          </ButtonGroup>
        </ButtonToolbar>
        <ButtonToolbar>
          <ButtonGroup bsSize="small">
            <Button>Left</Button>
            <Button>Middle</Button>
            <Button>Right</Button>
          </ButtonGroup>
        </ButtonToolbar>
        <ButtonToolbar>
          <ButtonGroup bsSize="xsmall">
            <Button>Left</Button>
            <Button>Middle</Button>
            <Button>Right</Button>
          </ButtonGroup>
        </ButtonToolbar>
      </div>

      <p></p>
      <ButtonGroup>
        <Button>1</Button>
        <Button>2</Button>
        <DropdownButton title="Dropdown" id="bg-nested-dropdown">
          <MenuItem eventKey="1">Dropdown link</MenuItem>
          <MenuItem eventKey="2">Dropdown link</MenuItem>
        </DropdownButton>
      </ButtonGroup>

     
      <p>Create a dropdown button with the DropdownButton  component </p>
      <ButtonToolbar>{ ListButtons.map(buttonAndId => renderDropdownButton(buttonAndId._1, buttonAndId._2)) }</ButtonToolbar>
      
    </div>

  }

}  