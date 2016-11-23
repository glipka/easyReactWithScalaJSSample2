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
trait JSPropsMediaContent[P] extends js.Object {
  def key: UndefOr[String] = js.native
  def ref: UndefOr[js.Function] = js.native
  def children: PropsChildren = js.native

}

@ScalaJSDefined
class MediaContent(val props: JSPropsMediaContent[Any]) extends Component[JSPropsMediaContent[Any], Any](props) {
  import com.glipka.easyReactJS.reactBootstrap.Common._
  override def componentWillMount: Unit = {}
  override def componentWillReceiveProps(nextProps: JSPropsMediaContent[Any], nextContext: js.Any) {}
  val onSelectAlert: js.Function = () => { println("onselectAlert") }

  @XmlToCreatElement
  override def render(): Any = {
    <div>
      <Grid>
        <Row>
          <Col xs={ 6 } md={ 4 }>
            <Image src="/assets/thumbnail.png" rounded="rounded"/>
          </Col>
          <Col xs={ 6 } md={ 4 }>
            <Image src="/assets/thumbnail.png" circle="circle"/>
          </Col>
          <Col xs={ 6 } md={ 4 }>
            <Image src="/assets/thumbnail.png" thumbnail="thumbnail"/>
          </Col>
        </Row>
      </Grid>
      <Image src="/assets/thumbnail.png" responsive="responsive"/>
      <Grid>
        <Row>
          <Col xs={ 6 } md={ 3 }>
            <Thumbnail href="#" alt="171x180" src="/assets/thumbnail.png"/>
          </Col>
          <Col xs={ 6 } md={ 3 }>
            <Thumbnail href="#" alt="171x180" src="/assets/thumbnail.png"/>
          </Col>
          <Col xs={ 6 } md={ 3 }>
            <Thumbnail href="#" alt="171x180" src="/assets/thumbnail.png"/>
          </Col>
        </Row>
      </Grid>
      <Grid>
        <Row>
          <Col xs={ 6 } md={ 4 }>
            <Thumbnail src="/assets/thumbnaildiv.png" alt="242x200">
              <h3>Thumbnail label</h3>
              <p>Description</p>
              <p>
                <Button bsStyle="primary">Button</Button>
                <Button bsStyle="default">Button</Button>
              </p>
            </Thumbnail>
          </Col>
          <Col xs={ 6 } md={ 4 }>
            <Thumbnail src="/assets/thumbnaildiv.png" alt="242x200">
              <h3>Thumbnail label</h3>
              <p>Description</p>
              <p>
                <Button bsStyle="primary">Button</Button>
                <Button bsStyle="default">Button</Button>
              </p>
            </Thumbnail>
          </Col>
          <Col xs={ 6 } md={ 4 }>
            <Thumbnail src="/assets/thumbnaildiv.png" alt="242x200">
              <h3>Thumbnail label</h3>
              <p>Description</p>
              <p>
                <Button bsStyle="primary">Button</Button>
                <Button bsStyle="default">Button</Button>
              </p>
            </Thumbnail>
          </Col>
        </Row>
      </Grid>
     

 <Carousel>
    <Carousel_Item>
      <img width={900} height={500} alt="900x500" src="/assets/carousel.png"/>
      <Carousel_Caption>
        <h3>First slide label</h3>
        <p>Nulla vitae elit libero, a pharetra augue mollis interdum.</p>
      </Carousel_Caption>
    </Carousel_Item>
    <Carousel_Item>
      <img width={900} height={500} alt="900x500" src="/assets/carousel.png"/>
      <Carousel_Caption>
        <h3>Second slide label</h3>
        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
      </Carousel_Caption>
    </Carousel_Item>
    <Carousel_Item>
      <img width={900} height={500} alt="900x500" src="/assets/carousel.png"/>
      <Carousel_Caption>
        <h3>Third slide label</h3>
        <p>Praesent commodo cursus magna, vel scelerisque nisl consectetur.</p>
      </Carousel_Caption>
    </Carousel_Item>
  </Carousel>






  <div>
    <Media>
      <Media_Left align="top">
        <img width={64} height={64} src="/assets/thumbnail.png" alt="Image"/>
      </Media_Left>
      <Media_Body>
        <Media_Heading>Top aligned media</Media_Heading>
        <p>Cras sit amet nibh libero, in gravida nulla. Nulla vel metus scelerisque ante sollicitudin commodo. Cras purus odio, vestibulum in vulputate at, tempus viverra turpis. Fusce condimentum nunc ac nisi vulputate fringilla. Donec lacinia congue felis in faucibus.</p>

        <p>Donec sed odio dui. Nullam quis risus eget urna mollis ornare vel eu leo. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.</p>
      </Media_Body>
    </Media>
    <Media>
      <Media_Left align="middle">
        <img width={64} height={64} src="/assets/thumbnail.png" alt="Image"/>
      </Media_Left>
      <Media_Body>
        <Media_Heading>Middle aligned media</Media_Heading>
        <p>Cras sit amet nibh libero, in gravida nulla. Nulla vel metus scelerisque ante sollicitudin commodo. Cras purus odio, vestibulum in vulputate at, tempus viverra turpis. Fusce condimentum nunc ac nisi vulputate fringilla. Donec lacinia congue felis in faucibus.</p>

        <p>Donec sed odio dui. Nullam quis risus eget urna mollis ornare vel eu leo. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.</p>
      </Media_Body>
    </Media>
    <Media>
      <Media_Left align="bottom">
        <img width={64} height={64} src="/assets/thumbnail.png" alt="Image"/>
      </Media_Left>
      <Media_Body>
        <Media_Heading>Bottom aligned media</Media_Heading>
        <p>Cras sit amet nibh libero, in gravida nulla. Nulla vel metus scelerisque ante sollicitudin commodo. Cras purus odio, vestibulum in vulputate at, tempus viverra turpis. Fusce condimentum nunc ac nisi vulputate fringilla. Donec lacinia congue felis in faucibus.</p>

        <p>Donec sed odio dui. Nullam quis risus eget urna mollis ornare vel eu leo. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.</p>
      </Media_Body>
    </Media>
  </div>

















    </div>

  }

}   


//<div style={js.Dynamic.literal("width" -> "660", "height" -> "auto")} >
//    <ResponsiveEmbed a16by9="a16by9">
//      <embed type="image/svg+xml" src="/assets/TheresaKnott_castle.svg" />
//    </ResponsiveEmbed>
//  </div>

