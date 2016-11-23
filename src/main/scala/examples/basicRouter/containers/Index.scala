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
package examples.basicRouter.containers

import com.glipka.easyReactJS.react._
import com.glipka.easyReactJS.redux._
import com.glipka.easyReactJS.redux.Redux._
import com.glipka.easyReactJS.reactRedux._
import com.glipka.easyReactJS.reactRedux.ReactRedux._

import org.scalajs.dom._
import scalajs.js
import scalajs.js._
import com.glipka.easyReactJS.react.ComponentClass
import scala.scalajs.js.annotation.JSExport
import scala.scalajs.js.JSApp

import scala.scalajs.js.annotation.ScalaJSDefined
import com.glipka.easyReactJS.react.ReactTypedConstructor
import scala.scalajs.js.annotation.JSExportAll
import com.glipka.easyReactJS.reactRouter.ReactRouter._
import com.glipka.easyReactJS.reactRouter._
import com.glipka.easyReactJS.react.xml.XmlToCreatElement
import examples.basicRouter.components._
import examples.basicRouter.components.bootstrap.BoostrapComponents
import examples.basicRouter.components.bootstrap.Buttons
import examples.basicRouter.components.bootstrap.Menus
import examples.basicRouter.components.bootstrap.ModalSample
import examples.basicRouter.components.bootstrap.Tooltips
import examples.basicRouter.components.bootstrap.Navigation
import examples.basicRouter.components.bootstrap.PageLayout
import examples.basicRouter.components.bootstrap.Forms
import examples.basicRouter.components.bootstrap.MediaContent
import examples.basicRouter.components.bootstrap.Miscellaneous

import com.glipka.easyReactJS.reduxForm._
import com.glipka.easyReactJS.reduxForm.ReduxForm._

@JSExport("App3")
object Index extends JSApp {

  override def main() {

    val styleRed = js.Dynamic.literal("color" -> "red")
    @XmlToCreatElement(true)
    val home: js.Function = () => {
      <div>
        <h2>Page Principale</h2>
      </div>
    }

    @XmlToCreatElement
    val noMatch: js.Function = (location: js.Dynamic) => { // revoir reactRouter.location
      <div>
        <h3>No match for <code>{ location.location.pathname }</code></h3>
      </div>
    }

    @XmlToCreatElement(true)
    val router = <BrowserRouter history={ browserHistory }>
                   <div>
                     <div>
                       <h2>Demonstration of Bootstrap3  Components</h2>
                       <ul role="nav">
                         <li><Link to="/boostrapComponents/buttons" activeStyle={ styleRed }>Buttons</Link></li>
                         <li><Link to="/boostrapComponents/menus" activeStyle={ styleRed }>Menus</Link></li>
                         <li><Link to="/boostrapComponents/modal" activeStyle={ styleRed }>Modal</Link></li>
                         <li><Link to="/boostrapComponents/tooltips" activeStyle={ styleRed }>Tooltips</Link></li>
                         <li><Link to="/boostrapComponents/navigation" activeStyle={ styleRed }>Navigation</Link></li>
                         <li><Link to="/boostrapComponents/pageLayout" activeStyle={ styleRed }>PageLayout</Link></li>
                         <li><Link to="/boostrapComponents/forms" activeStyle={ styleRed }>Forms</Link></li>
                         <li><Link to="/boostrapComponents/mediaContent" activeStyle={ styleRed }>MediaContent</Link></li>
                         <li><Link to="/boostrapComponents/miscellaneous" activeStyle={ styleRed }>Miscellaneoust</Link></li>
                       </ul>
                     </div>
                     <Match exactly={ true } pattern="/" component={ home }/>
                     <Match pattern="/boostrapComponents/buttons" component={ Buttons }/>
                     <Match pattern="/boostrapComponents/menus" component={ Menus }/>
                     <Match pattern="/boostrapComponents/modal" component={ ModalSample }/>
                     <Match pattern="/boostrapComponents/tooltips" component={ Tooltips }/>
                     <Match pattern="/boostrapComponents/navigation" component={ Navigation }/>
                     <Match pattern="/boostrapComponents/pageLayout" component={ PageLayout }/>
                     <Match pattern="/boostrapComponents/forms" component={ Forms }/>
                     <Match pattern="/boostrapComponents/mediaContent" component={ MediaContent }/>
                     <Match pattern="/boostrapComponents/miscellaneous" component={ Miscellaneous }/>
                     <Miss component={ noMatch }/>
                   </div>
                 </BrowserRouter>

    ReactDOM.render(router, document.getElementById("content"));

  }

} 
 
 