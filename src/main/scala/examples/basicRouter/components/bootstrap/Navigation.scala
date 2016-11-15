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
trait JSPropsNavigation[P] extends js.Object {
  def key: UndefOr[String] = js.native
  def ref: UndefOr[js.Function] = js.native
  def children: PropsChildren = js.native

}

@ScalaJSDefined
class Navigation(val props: JSPropsNavigation[Any]) extends Component[JSPropsNavigation[Any], Any](props) {
  import reactBootstrap.Common._
  override def componentWillMount: Unit = {}
  override def componentWillReceiveProps(nextProps: JSPropsNavigation[Any], nextContext: js.Any) {}
  var activePage = 0
  val handleSelect: js.Function = (keyId: String) => {
    println(s"selected key called! $keyId")
  }

  @XmlToCreatElement(true)
  override def render(): Any = {
    <div>
      <p>navbar inverse</p>
      <Navbar inverse={ true }>
        <Navbar_Header>
          <Navbar_Brand>
            <a href="#">React-Bootstrap</a>
          </Navbar_Brand>
        </Navbar_Header>
        <Navbar_Collapse>
          <Nav>
            <NavItem eventKey={ 1 } href="#">Link</NavItem>
            <NavItem eventKey={ 2 } href="#">Link</NavItem>
            <NavDropdown eventKey={ 3 } title="Dropdown" id="basic-nav-dropdown">
              <MenuItem eventKey={ 3.1 }>Action</MenuItem>
              <MenuItem eventKey={ 3.2 }>Another action</MenuItem>
              <MenuItem eventKey={ 3.3 }>Something else here</MenuItem>
              <MenuItem divider={ true }/>
              <MenuItem eventKey={ 3.3 }>Separated link</MenuItem>
            </NavDropdown>
          </Nav>
          <Nav pullRight={ true }>
            <NavItem eventKey={ 1 } href="#">Link Right1</NavItem>
            <NavItem eventKey={ 2 } href="#">Link Right2</NavItem>
          </Nav>
        </Navbar_Collapse>
      </Navbar>
      <p> Navigation avec Formulaire </p>
      <Navbar>
        <Navbar_Header>
          <Navbar_Brand>
            <a href="#">Brand</a>
          </Navbar_Brand>
        </Navbar_Header>
        <Navbar_Collapse>
          <Navbar_Form pullLeft="pullLeft">
            <FormGroup>
              <FormControl type="text" placeholder="Search"/>
            </FormGroup>
            <Button type="submit">Submit</Button>
          </Navbar_Form>
        </Navbar_Collapse>
      </Navbar>
      <Breadcrumb>
        <Breadcrumb_Item href="#">
          Home
        </Breadcrumb_Item>
        <Breadcrumb_Item href="http://getbootstrap.com/components/#breadcrumbs">
          Library
        </Breadcrumb_Item>
        <Breadcrumb_Item active="active">
          Data
        </Breadcrumb_Item>
      </Breadcrumb>
























    </div>
          
            
            
            
            
            
            
            

  }

}  
 
 
 
 
/*
<Tab_Container id="tabs-with-dropdown" defaultActiveKey="first">
    <Row className="clearfix">
      <Col sm={12}>
        <Nav bsStyle="tabs">
          <NavItem eventKey="first">
            Tab 1
          </NavItem>
          <NavItem eventKey="second">
            Tab 2
          </NavItem>
          <NavDropdown eventKey="3" title="Dropdown" id="nav-dropdown-within-tab">
            <MenuItem eventKey="3.1">Action</MenuItem>
            <MenuItem eventKey="3.2">Another action</MenuItem>
            <MenuItem eventKey="3.3">Something else here</MenuItem>
            <MenuItem divider="divider" />
            <MenuItem eventKey="3.4">Separated link</MenuItem>
          </NavDropdown>
        </Nav>
      </Col>
      <Col sm={12}>
        <Tab_Content animation="animation">
          <Tab_Pane eventKey="first">
            Tab 1 content
          </Tab_Pane>
          <Tab_Pane eventKey="second">
            Tab 2 content
          </Tab_Pane>
          <Tab_Pane eventKey="3.1">
            Tab 3.1 content
          </Tab_Pane>
          <Tab_Pane eventKey="3.2">
            Tab 3.2 content
          </Tab_Pane>
          <Tab_Pane eventKey="3.3">
            Tab 3.3 content
          </Tab_Pane>
          <Tab_Pane eventKey="3.4">
            Tab 3.4 content
          </Tab_Pane>
        </Tab_Content>
      </Col>
    </Row>
  </Tab_Container> 
  
   <Pager>
        <Pager_Item href="#">Previous</Pager_Item>
        <Pager_Item href="#">Next</Pager_Item>
      </Pager>
 
<=<Nav pullRight>
      <NavItem eventKey={1}>
        <Link to="home">Home</Link>
      </NavItem>
      <NavItem eventKey={2}>
        <Link to="book">Book Inv</Link>
      </NavItem>
      <NavDropdown eventKey={3} title="Authorization" id="basic-nav-dropdown">
        <MenuItem eventKey="3.1">
          <a href="" onClick={this.logout}>Logout</a>
        </MenuItem>          
      </NavDropdown>  
    </Nav>
    *  * */
   
