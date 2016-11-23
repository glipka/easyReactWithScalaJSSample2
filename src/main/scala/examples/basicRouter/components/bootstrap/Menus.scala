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

 
import com.glipka.easyReactJS.react._
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