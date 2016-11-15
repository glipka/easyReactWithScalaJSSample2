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
import scala.scalajs.js.Dynamic._

@js.native
trait JSPropsPageLayout[P] extends js.Object {
  def key: UndefOr[String] = js.native
  def ref: UndefOr[js.Function] = js.native
  def children: PropsChildren = js.native

}

@ScalaJSDefined
class StatePageLayout extends js.Object {
  var opened = false
  var activeKey = 2

}

@ScalaJSDefined
class PageLayout(val props: JSPropsPageLayout[Any]) extends Component[JSPropsPageLayout[Any], StatePageLayout](props) {
  import reactBootstrap.Common._

  override def componentWillMount: Unit = { this.state = new StatePageLayout }
  override def componentWillReceiveProps(nextProps: JSPropsPageLayout[Any], nextContext: js.Any) {}
  var activePage = 0

  val handleSelect: js.Function = (keyId: Int) => {
    println(s"selected key called! $keyId")
    val oldState = this.state
    oldState.activeKey = keyId
    this.setState(oldState);

  }
  val alertClicked: js.Function = () => {
    println(s"clicked")
  }
  val setState1: js.Function = () => {
    println(s"setstate1 clicked xxx :  ${this.state.opened}")
    val oldState = this.state
    oldState.opened = !this.state.opened
    this.setState(oldState);

  }
  @XmlToCreatElement
  val panelTitle = <h3>Panel title Georges Lipka</h3>

  @XmlToCreatElement 
  override def render(): Any = {
    <div>
      <Grid>
        <Row className="show-grid">
          <Col xs={ 12 } md={ 8 }>  Col xs= 12  md= 8    </Col>
          <Col xs={ 6 } md={ 4 }> Col xs= 6  md= 4   </Col>
        </Row>
        <Row className="show-grid">
          <Col xs={ 6 } md={ 4 }>    Col xs= 6  md= 4 </Col>
          <Col xs={ 6 } md={ 4 }>    Col xs= 6  md=4</Col>
          <Col xsHidden={true} md={ 4 }>Col xsHidden md= 4</Col>
        </Row>
        <Row className="show-grid">
          <Col xs={ 6 } xsOffset={ 6 }> Col xs=6 xsOffset=6   </Col>
        </Row>
        <Row className="show-grid">
          <Col md={ 6 } mdPush={ 6 }>Col md=6 mdPush=6</Col>
          <Col md={ 6 } mdPull={ 6 }>Col md=6 mdPull=6</Col>
        </Row>
      </Grid>
      <Jumbotron>
        <h1>Hello, world!</h1>
        <p>This is a simple hero unit, a simple jumbotron-style component for calling extra attention to featured content or information.</p>
        <p><Button bsStyle="success">Learn more</Button></p>
      </Jumbotron>
      <PageHeader>Example page header <small>Subtext for header</small></PageHeader>
      <ListGroup>
        <ListGroupItem>Item 1</ListGroupItem>
        <ListGroupItem>Item 2</ListGroupItem>
        <ListGroupItem>...</ListGroupItem>
      </ListGroup>
      <ListGroup>
        <ListGroupItem href="#link1">Link 1</ListGroupItem>
        <ListGroupItem href="#link2">Link 2</ListGroupItem>
        <ListGroupItem onClick={ alertClicked.bind(this) }>
          Trigger an alert
        </ListGroupItem>
      </ListGroup>
      <ListGroup>
        <ListGroupItem href="#" active="active">Link 1</ListGroupItem>
        <ListGroupItem href="#">Link 2</ListGroupItem>
        <ListGroupItem href="#" disabled={true}>Link 3</ListGroupItem>
      </ListGroup>
      <ListGroup>
        <ListGroupItem bsStyle="success">Success</ListGroupItem>
        <ListGroupItem bsStyle="info">Info</ListGroupItem>
        <ListGroupItem bsStyle="warning">Warning</ListGroupItem>
        <ListGroupItem bsStyle="danger">Danger</ListGroupItem>
      </ListGroup>
      <ListGroup>
        <ListGroupItem header="Heading 1">Some body text</ListGroupItem>
        <ListGroupItem header="Heading 2" href="#">Linked item</ListGroupItem>
        <ListGroupItem header="Heading 3" bsStyle="danger">Danger styling</ListGroupItem>
      </ListGroup>
      <ListGroup componentClass="ul">
        <CustomComponent_>Custom Child 1 </CustomComponent_>
        <CustomComponent_>Custom Child 2 </CustomComponent_>
        <CustomComponent_>Custom Child 3 </CustomComponent_>
      </ListGroup>
      <Table responsive={true} striped={true} bordered={true} condensed={true} hover={true}>
        <thead>
          <tr>
            <th>#</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Username</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>1</td>
            <td>Mark</td>
            <td>Otto</td>
            <td>@mdo</td>
          </tr>
          <tr>
            <td>2</td>
            <td>Jacob</td>
            <td>Thornton</td>
            <td>@fat</td>
          </tr>
          <tr>
            <td>3</td>
            <td colSpan="2">Larry the Bird</td>
            <td>@twitter</td>
          </tr>
        </tbody>
      </Table>
      <Panel onClick={ alertClicked.bind(this) }>
        Basic panel example
      </Panel>
      <div>
        <Button onClick={ setState1.bind(this) }>
          click To Expand Panel: state={ state.opened }
        </Button>
        <Panel header={ panelTitle } footer="Panel footer" collapsible={true} expanded={ state.opened }>
          Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid.
          Nihil anim keffiyeh helvetica, craft beer labore wes anderson cred nesciunt sapiente ea proident.
        </Panel>
      </div>
      <div>
        <Panel header={ panelTitle }>
          Panel content
        </Panel>
        <Panel header={ panelTitle } bsStyle="primary">
          Panel content
        </Panel>
        <Panel header={ panelTitle } bsStyle="success">
          Panel content
        </Panel>
        <Panel header={ panelTitle } bsStyle="info">
          Panel content
        </Panel>
        <Panel header={ panelTitle } bsStyle="warning">
          Panel content
        </Panel>
        <Panel header={ panelTitle } bsStyle="danger">
          Panel content
        </Panel>
      </div>
      <Panel collapsible={true} defaultExpanded={true} header={ panelTitle }>
        Some default panel content here.
        <ListGroup fill={true}>
          <ListGroupItem>Item 1</ListGroupItem>
          <ListGroupItem>Item 2</ListGroupItem>
          <ListGroupItem>;;;;;;;</ListGroupItem>
        </ListGroup>
        Some more panel content here.
      </Panel>
      <PanelGroup activeKey={ this.state.activeKey } onSelect={ this.handleSelect.bind(this) } accordion={true}>
        <Panel header="Panel 1" eventKey="1">Panel 1 content</Panel>
        <Panel header="Panel 2" eventKey="2">Panel 2 content</Panel>
      </PanelGroup>
      <Accordion>
        <Panel header="Collapsible Group Item #1" eventKey="1">
          Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on it squid single-origin coffee nulla assumenda shoreditch et. Nihil anim keffiyeh helvetica, craft beer labore wes anderson cred nesciunt sapiente ea proident. Ad vegan excepteur butcher vice lomo. Leggings occaecat craft beer farm-to-table, raw denim aesthetic synth nesciunt you probably haven't heard of them accusamus labore sustainable VHS.
        </Panel>
        <Panel header="Collapsible Group Item #2" eventKey="2">
          Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on it squid single-origin coffee nulla assumenda shoreditch et. Nihil anim keffiyeh helvetica, craft beer labore wes anderson cred nesciunt sapiente ea proident. Ad vegan excepteur butcher vice lomo. Leggings occaecat craft beer farm-to-table, raw denim aesthetic synth nesciunt you probably haven't heard of them accusamus labore sustainable VHS.
        </Panel>
        <Panel header="Collapsible Group Item #3" eventKey="3">
          Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on it squid single-origin coffee nulla assumenda shoreditch et. Nihil anim keffiyeh helvetica, craft beer labore wes anderson cred nesciunt sapiente ea proident. Ad vegan excepteur butcher vice lomo. Leggings occaecat craft beer farm-to-table, raw denim aesthetic synth nesciunt you probably haven't heard of them accusamus labore sustainable VHS.
        </Panel>
      </Accordion>
 				<Well>Look I'm in a well!</Well>
    </div>

  }

}  
 