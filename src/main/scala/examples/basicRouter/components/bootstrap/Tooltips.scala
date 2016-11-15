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
import reactBootstrap.ReactBootstrap._
import reactBootstrap._
import react.xml.XmlToCreatElement

import scala.scalajs.js.Any.fromString
import scala.scalajs.js.Any.fromUnit
import scala.scalajs.js.Dynamic._

@js.native
trait JSPropsToooltips[P] extends js.Object {
  def key: UndefOr[String] = js.native
  def ref: UndefOr[js.Function] = js.native
  def children: PropsChildren = js.native

}


@ScalaJSDefined
class Tooltips(val props: JSPropsToooltips[Any]) extends Component[JSPropsToooltips[Any], Any](props) {
  override def componentWillMount: Unit = {}
  override def componentWillReceiveProps(nextProps: JSPropsToooltips[Any], nextContext: js.Any) {}

@XmlToCreatElement
val popoverTop = <Popover id="popover-positioned-top" title="Popover top">
    <strong>Holy guacamole!</strong> Check this info.
  </Popover>
 
@XmlToCreatElement
   val popoverLeft = <Popover id="popover-positioned-left" title="Popover left">
    <strong>Holy guacamole!</strong> Check this info  </Popover>
 
@XmlToCreatElement
 val popoverBottom =  <Popover id="popover-positioned-bottom" title="Popover bottom">
    <strong>Holy guacamole!</strong> Check this info</Popover>
 
@XmlToCreatElement
val popoverRight = <Popover id="popover-positioned-right" title="Popover right">
    <strong>Holy guacamole!</strong> Check this info. 
  </Popover>
 
  @XmlToCreatElement
  override def render(): Any = {
    <div>    
        <Tooltip placement="right" className="in" id="tooltip-right">
          Tooltip right
        </Tooltip>
        <Tooltip placement="top" className="in" id="tooltip-top">
          Tooltip top
        </Tooltip>
        <Tooltip placement="left" className="in" id="tooltip-left">
          Tooltip left
        </Tooltip>
        <Tooltip placement="bottom" className="in" id="tooltip-bottom">
          Tooltip bottom
        </Tooltip>


			<p></p>
      <div style={ literal("height" -> "120px") }>
        <Popover id="popover-basic" placement="right" positionLeft={ "200px" } positionTop={ "50px" } title="Popover right">
          And here's some<strong>amazing</strong>
          content. It's very engaging. right?
        </Popover>
      </div> 
 

    </div>

  }

}   

/*
 <p></p>
      <div style={ literal("height" -> 120) }>
        <Popover id="popover-basic" placement="right" positionLeft={ "200px" } positionTop={ "50px" } title="Popover right">
          And here's some<strong>amazing</strong>
          content. It's very engaging. right?
        </Popover>
      </div>
      <p> *** pop Over *** </p>
      <ButtonToolbar>
        <OverlayTrigger trigger="click" placement="left" overlay={ popoverLeft }>
          <Button>Holy guacamole!</Button>
        </OverlayTrigger>
        <OverlayTrigger trigger="click" placement="top" overlay={ popoverTop }>
          <Button>Holy guacamole!</Button>
        </OverlayTrigger>
        <OverlayTrigger trigger="click" placement="bottom" overlay={ popoverBottom }>
          <Button>Holy guacamole!</Button>
        </OverlayTrigger>
        <OverlayTrigger trigger="click" placement="right" overlay={ popoverRight }>
          <Button>Holy guacamole!</Button>
        </OverlayTrigger>
      </ButtonToolbar>
*/

