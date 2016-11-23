/*
 # Copyright 2016 Georges Lipka
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
*/
package examples.basicRouter.components.bootstrap

import  com.glipka.easyReactJS.react._
import org.scalajs.dom._
import scalajs.js
import scalajs.js._
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.JSConverters._
import com.glipka.easyReactJS.reactRouter._
import com.glipka.easyReactJS.reactBootstrap.ReactBootstrap._
import com.glipka.easyReactJS.reactBootstrap._
import com.glipka.easyReactJS.react.xml.XmlToCreatElement

import scala.scalajs.js.Any.fromString
import scala.scalajs.js.Any.fromUnit

@js.native
trait JSPropsMiscellaneous[P] extends js.Object {
  def key: UndefOr[String] = js.native
  def ref: UndefOr[js.Function] = js.native
  def children: PropsChildren = js.native

}

@ScalaJSDefined
class Miscellaneous(val props: JSPropsMiscellaneous[Any]) extends Component[JSPropsMiscellaneous[Any], Any](props) {
  import com.glipka.easyReactJS.reactBootstrap.Common._
  override def componentWillMount: Unit = {}
  override def componentWillReceiveProps(nextProps: JSPropsMiscellaneous[Any], nextContext: js.Any) {}
  val onSelectAlert: js.Function = () => { println("onselectAlert") }

  @XmlToCreatElement
  override def render(): Any = {

    <div>
      <ButtonToolbar>
        <ButtonGroup>
          <Button><Glyphicon glyph="align-left"/></Button>
          <Button><Glyphicon glyph="align-center"/></Button>
          <Button><Glyphicon glyph="align-right"/></Button>
          <Button><Glyphicon glyph="align-justify"/></Button>
        </ButtonGroup>
      </ButtonToolbar>
      <ButtonToolbar>
        <ButtonGroup>
          <Button bsSize="large"><Glyphicon glyph="star"/> Star</Button>
          <Button><Glyphicon glyph="star"/> Star</Button>
          <Button bsSize="small"><Glyphicon glyph="star"/> Star</Button>
          <Button bsSize="xsmall"><Glyphicon glyph="star"/> Star</Button>
        </ButtonGroup>
      </ButtonToolbar>
      <div>
        <h1>Label <Label>New</Label></h1>
        <h2>Label <Label>New</Label></h2>
        <h3>Label <Label>New</Label></h3>
        <h4>Label <Label>New</Label></h4>
        <h5>Label <Label>New</Label></h5>
        <p>Label <Label>New</Label></p>
      </div>
      <div>
        <Label bsStyle="default">Default</Label>
        <Label bsStyle="primary">Primary</Label>
        <Label bsStyle="success">Success</Label>
        <Label bsStyle="info">Info</Label>
        <Label bsStyle="warning">Warning</Label>
        <Label bsStyle="danger">Danger</Label>
      </div>
      <p>Badges <Badge>42</Badge></p>
      <Alert bsStyle="warning">
        <strong>Holy guacamole!</strong>
        Best check yo self, you're not looking too good.
      </Alert>
      <ProgressBar now={ 60 }/>
      <div>
        <ProgressBar bsStyle="success" now={ 40 }/>
        <ProgressBar bsStyle="info" now={ 20 }/>
        <ProgressBar bsStyle="warning" now={ 60 }/>
        <ProgressBar bsStyle="danger" now={ 80 }/>
      </div>
      <div>
        <ProgressBar striped="striped" bsStyle="success" now={ 40 }/>
        <ProgressBar striped="striped" bsStyle="info" now={ 20 }/>
        <ProgressBar striped="striped" bsStyle="warning" now={ 60 }/>
        <ProgressBar striped="striped" bsStyle="danger" now={ 80 }/>
      </div>
      <ProgressBar active="active" now={ 45 }/>
      <ProgressBar>
        <ProgressBar striped="striped" bsStyle="success" now={ 35 } key={ 1 }/>
        <ProgressBar bsStyle="warning" now={ 20 } key={ 2 }/>
        <ProgressBar active="active" bsStyle="danger" now={ 10 } key={ 3 }/>
      </ProgressBar>
    </div>

  }

}   


 

