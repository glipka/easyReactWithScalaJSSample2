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
import org.scalajs.dom.raw.HTMLInputElement

@js.native
trait JSPropsForms[P] extends js.Object {
  def key: UndefOr[String] = js.native
  def ref: UndefOr[js.Function] = js.native
  def children: PropsChildren = js.native

}

@ScalaJSDefined
class StateForms extends js.Object {
  var value = ""
  var activeKey = 2

}

@ScalaJSDefined
class Forms(val props: JSPropsForms[Any]) extends Component[JSPropsForms[Any], StateForms](props) {
  import reactBootstrap.Common._

  override def componentWillMount: Unit = { this.state = new StateForms }
  override def componentWillReceiveProps(nextProps: JSPropsForms[Any], nextContext: js.Any) {}
  var activePage = 0

  val handleChange: js.Function = (e: Event) => {
    val newState = new StateForms
    newState.value = e.target.valueOf().asInstanceOf[HTMLInputElement].value
    this.setState(newState);

  }
  def getValidationState(): String = {
    val length = this.state.value.length;
    if (length > 10) return "success"
    else if (length > 5) return "warning"
    else return "error"

  }

  @XmlToCreatElement
  override def render(): Any = {
    <div>
      <form>
        <FormGroup controlId="formBasicText" validationState={ this.getValidationState() }>
          <ControlLabel>Working example with validation</ControlLabel>
          <FormControl type="text" value={ this.state.value } placeholder="Enter text" onChange={ this.handleChange }/>
          <FormControl_Feedback/>
          <HelpBlock>Validation is based on string length.</HelpBlock>
        </FormGroup>
      </form>
      <form>
        <FormGroup controlId="formControlsText">
          <ControlLabel>Text</ControlLabel>
          <FormControl type="text" placeholder="Enter text"/>
          <HelpBlock>Validation is based on string length.</HelpBlock>
        </FormGroup>
        <FormGroup controlId="formControlsEmail">
          <ControlLabel>Email Addess</ControlLabel>
          <FormControl type="text" placeholder="Enter Emailt"/>
          <HelpBlock>Validation is based on string length.</HelpBlock>
        </FormGroup>
        <FormGroup controlId="formControlsPassword">
          <ControlLabel>passwprd</ControlLabel>
          <FormControl type="password" placeholder="Enter Password"/>
          <HelpBlock>Validation is based on string length.</HelpBlock>
        </FormGroup>
        <FormGroup controlId="formControlsFile">
          <ControlLabel>passwprd</ControlLabel>
          <FormControl type="file" placeholder="Filed"/>
          <HelpBlock>Example block-level help text here.</HelpBlock>
        </FormGroup>
        <Checkbox checked="checked" readOnly="readOnly">
          Checkbox
        </Checkbox>
        <Radio checked="checked" readOnly="readOnly">
          Radio
        </Radio>
        <FormGroup>
          <Checkbox inline={ true }>
            1
          </Checkbox>
          <Checkbox inline={ true }>
            2
          </Checkbox>
          <Checkbox inline={ true }>
            3
          </Checkbox>
        </FormGroup>
        <FormGroup>
          <Radio inline={ true }>
            1
          </Radio>
          <Radio inline={ true }>
            2
          </Radio>
          <Radio inline={ true }>
            3
          </Radio>
        </FormGroup>
        <FormGroup controlId="formControlsSelect">
          <ControlLabel>Select</ControlLabel>
          <FormControl componentClass="select" placeholder="select">
            <option value="select1">select1</option>
            <option value="select1">select1</option>
            <option value="select2">select2</option>
            <option value="select3">select3</option>
            <option value="other">...</option>
          </FormControl>
        </FormGroup>
        <FormGroup controlId="formControlsSelectMultiple">
          <ControlLabel>Multiple select</ControlLabel>
          <FormControl componentClass="select" multiple="multiple">
            <option value="select">select (multiple)</option>
            <option value="select1">select1</option>
            <option value="select2">select2</option>
            <option value="select3">select3</option>
            <option value="other">...</option>
          </FormControl>
        </FormGroup>
        <FormGroup controlId="formControlsTextarea">
          <ControlLabel>Textarea</ControlLabel>
          <FormControl componentClass="textarea" placeholder="textarea"/>
        </FormGroup>
        <FormGroup>
          <ControlLabel>Static text</ControlLabel>
          <FormControl_Static>
            email@example.com
          </FormControl_Static>
        </FormGroup>
        <Button type="submit">
          Submit
        </Button>
      </form>
      <p>Form Inline True</p>
      <Form inline={ true }>
        <FormGroup controlId="formInlineName">
          <ControlLabel>Name</ControlLabel>
          <FormControl type="text" placeholder="Jane Doe"/>
        </FormGroup>
        <FormGroup controlId="formInlineEmail">
          <ControlLabel>Email</ControlLabel>
          <FormControl type="email" placeholder="jane.doe@example.com"/>
        </FormGroup>
        <Button type="submit">
          Send invitation
        </Button>
      </Form>
      <Form horizontal={ true }>
        <FormGroup controlId="formHorizontalEmail">
          <Col componentClass={ ControlLabel } sm={ 2 }>
            Email
          </Col>
          <Col sm={ 10 }>
            <FormControl type="email" placeholder="Email"/>
          </Col>
        </FormGroup>
        <FormGroup controlId="formHorizontalPassword">
          <Col componentClass={ ControlLabel } sm={ 2 }>
            Password
          </Col>
          <Col sm={ 10 }>
            <FormControl type="password" placeholder="Password"/>
          </Col>
        </FormGroup>
        <FormGroup>
          <Col smOffset={ 2 } sm={ 10 }>
            <Checkbox>Remember me</Checkbox>
          </Col>
        </FormGroup>
        <FormGroup>
          <Col smOffset={ 2 } sm={ 10 }>
            <Button type="submit">
              Sign in
            </Button>
          </Col>
        </FormGroup>
      </Form>
      <form>
        <FormGroup bsSize="large">
          <FormControl type="text" placeholder="Large text"/>
        </FormGroup>
        <FormGroup>
          <FormControl type="text" placeholder="Normal text"/>
        </FormGroup>
        <FormGroup bsSize="small">
          <FormControl type="text" placeholder="Small text"/>
        </FormGroup>
      </form>
      <form>
        <FormGroup>
          <InputGroup>
            <InputGroup_Addon>@</InputGroup_Addon>
            <FormControl type="text"/>
          </InputGroup>
        </FormGroup>
        <FormGroup>
          <InputGroup>
            <FormControl type="text"/>
            <InputGroup_Addon>.00</InputGroup_Addon>
          </InputGroup>
        </FormGroup>
        <FormGroup>
          <InputGroup>
            <InputGroup_Addon>$</InputGroup_Addon>
            <FormControl type="text"/>
            <InputGroup_Addon>.00</InputGroup_Addon>
          </InputGroup>
        </FormGroup>
        <FormGroup>
          <InputGroup>
            <FormControl type="text"/>
            <InputGroup_Addon>
              <Glyphicon glyph="music"/>
            </InputGroup_Addon>
          </InputGroup>
        </FormGroup>
        <FormGroup>
          <InputGroup>
            <InputGroup_Button>
              <Button>Before</Button>
            </InputGroup_Button>
            <FormControl type="text"/>
          </InputGroup>
        </FormGroup>
        <FormGroup>
          <InputGroup>
            <FormControl type="text"/>
            <DropdownButton componentClass={ InputGroupButton } id="input-dropdown-addon" title="Action">
              <MenuItem key="1">Item</MenuItem>
            </DropdownButton>
          </InputGroup>
        </FormGroup>
        <FormGroup>
          <InputGroup>
            <InputGroup_Addon>
              <input type="radio" aria-label="..."/>
            </InputGroup_Addon>
            <FormControl type="text"/>
          </InputGroup>
        </FormGroup>
        <FormGroup>
          <InputGroup>
            <InputGroup_Addon>
              <input type="checkbox" aria-label="..."/>
            </InputGroup_Addon>
            <FormControl type="text"/>
          </InputGroup>
        </FormGroup>
      </form>
      <p>validation state </p>
      <form>
        <FormGroup controlId="formValidationSuccess1" validationState="success">
          <ControlLabel>Input with success</ControlLabel>
          <FormControl type="text"/>
          <HelpBlock>Help text with validation state.</HelpBlock>
        </FormGroup>
        <FormGroup controlId="formValidationWarning1" validationState="warning">
          <ControlLabel>Input with warning</ControlLabel>
          <FormControl type="text"/>
        </FormGroup>
        <FormGroup controlId="formValidationError1" validationState="error">
          <ControlLabel>Input with error</ControlLabel>
          <FormControl type="text"/>
        </FormGroup>
        <FormGroup controlId="formValidationSuccess2" validationState="success">
          <ControlLabel>Input with success and feedback icon</ControlLabel>
          <FormControl type="text"/>
          <FormControl_Feedback/>
        </FormGroup>
        <FormGroup controlId="formValidationWarning2" validationState="warning">
          <ControlLabel>Input with warning and feedback icon</ControlLabel>
          <FormControl type="text"/>
          <FormControl_Feedback/>
        </FormGroup>
        <FormGroup controlId="formValidationError2" validationState="error">
          <ControlLabel>Input with error and feedback icon</ControlLabel>
          <FormControl type="text"/>
          <FormControl_Feedback/>
        </FormGroup>
  <FormGroup controlId="formValidationSuccess3" validationState="success">
          <ControlLabel>Input with success and custom feedback icon</ControlLabel>
          <FormControl type="text"/>
          <FormControl_Feedback>
         
          </FormControl_Feedback>
        </FormGroup>
 <FormGroup controlId="formValidationWarning3" validationState="warning">
          <ControlLabel>Input group with warning</ControlLabel>
          <InputGroup>
            <InputGroup_Addon>@</InputGroup_Addon>
            <FormControl type="text"/>
          </InputGroup>
          <FormControl_Feedback/>
        </FormGroup>
        <Form componentClass="fieldset" horizontal={ true }>
          <FormGroup controlId="formValidationError3" validationState="error">
            <Col componentClass={ ControlLabel } xs={ 3 }>
              Input with error
            </Col>
            <Col xs={ 9 }>
              <FormControl type="text"/>
              <FormControl_Feedback/>
            </Col>
          </FormGroup>
          <FormGroup controlId="formValidationSuccess4" validationState="success">
            <Col componentClass={ ControlLabel } xs={ 3 }>
              Input group with success
            </Col>
            <Col xs={ 9 }>
              <InputGroup>
                <InputGroup_Addon>@</InputGroup_Addon>
                <FormControl type="text"/>
              </InputGroup>
              <FormControl_Feedback/>
            </Col>
          </FormGroup>
        </Form>
        <Form componentClass="fieldset" inline={ true }>
          <FormGroup controlId="formValidationWarning4" validationState="warning">
            <ControlLabel>Input with warning</ControlLabel>
            <FormControl type="text"/>
            <FormControl_Feedback/>
          </FormGroup>
          <FormGroup controlId="formValidationError4" validationState="error">
            <ControlLabel>Input group with error</ControlLabel>
            <InputGroup>
              <InputGroup_Addon>@</InputGroup_Addon>
              <FormControl type="text"/>
            </InputGroup>
            <FormControl_Feedback/>
          </FormGroup>
        </Form>
        <Checkbox validationState="success">
          Checkbox with success
        </Checkbox>
        <Radio validationState="warning">
          Radio with warning
        </Radio>
        <Checkbox validationState="error">
          Checkbox with error
        </Checkbox>
        <FormGroup validationState="success">
          <Checkbox inline={ true }>
            Checkbox
          </Checkbox>
          <Checkbox inline={ true }>
            with
          </Checkbox>
          <Checkbox inline={ true }>
            success
          </Checkbox>
        </FormGroup>
      </form>    
      
    </div>

  }

}  
/*
 * 
 


     


    
 */
 