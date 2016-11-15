package examples.basicRouter.components.bootstrap

import react._
import org.scalajs.dom._
import scalajs.js
import scalajs.js._
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.JSConverters._
import reactRouter._
import reactBootstrap.ReactBootstrap._
import reactBootstrap.Common._
import reactBootstrap._
import react.xml.XmlToCreatElement

import scala.scalajs.js.Any.fromString
import scala.scalajs.js.Any.fromUnit

@js.native
trait JSPropsModal[P] extends js.Object {
  def key: UndefOr[String] = js.native
  def ref: UndefOr[js.Function] = js.native
  def children: PropsChildren = js.native

}
@ScalaJSDefined
class ModalState extends js.Object {
  var show = false

}
@ScalaJSDefined
class ModalSample(val props: JSPropsModal[Any]) extends Component[JSPropsModal[Any], ModalState](props) {
  import reactBootstrap.ReactBootstrap._
  override def componentWillMount: Unit = {
    this.state = new ModalState

  }
  // modif de l'état 
  var close: js.Function = () => {
    var state1 = new ModalState
    state1.show = false
    val s = "contenu du state=" + state.show
    println(s)
    setState(state1)
  }
  var show: js.Function = () => {
     val s = "contenu du state=" + state.show
    println(s)
    var state1 = new ModalState
    state1.show = true
    
    setState(state1)
  }
  this.state = new ModalState
  override def componentWillReceiveProps(nextProps: JSPropsModal[Any], nextContext: js.Any) {}
  val onSelectAlert: js.Function = () => { println("onselectAlert") }

  // 

  @XmlToCreatElement
  override def render(): Any = {
   <div> 
		***** page modale *****
    <div className="modal-container" style={ js.Dynamic.literal("height" -> 200) }>
      <Button bsStyle="primary" bsSize="large" onClick={ show.bind(this) }>
        Launch contained modal
      </Button>
      <Modal show={ this.state.show } onHide={ this.close.bind(this) } container={ this } aria-labelledby="contained-modal-title">
        <Modal_Header closeButton="true">
          <Modal_Title id="contained-modal-title">Contained Modal</Modal_Title>
        </Modal_Header>
        <Modal_Body>
          Elit est explicabo ipsum eaque dolorem blanditiis doloribus sed id ipsam, beatae, rem fuga id earum? Inventore et facilis obcaecati.
        </Modal_Body>
        <Modal_Footer>
          <Button onClick={ close.bind(this) }>Close</Button>
        </Modal_Footer>
      </Modal>
    </div>
</div>

  }

}  



 