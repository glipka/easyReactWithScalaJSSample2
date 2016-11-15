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