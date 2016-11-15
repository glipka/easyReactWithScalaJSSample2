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

import react._
import redux._
import redux.Redux._
import reactRedux._
import reactRedux.ReactRedux._

import org.scalajs.dom._
import scalajs.js
import scalajs.js._
import react.ComponentClass
import scala.scalajs.js.annotation.JSExport
import scala.scalajs.js.JSApp

import scala.scalajs.js.annotation.ScalaJSDefined
import react.ReactTypedConstructor
import scala.scalajs.js.annotation.JSExportAll
import reactRouter.ReactRouter._
import reactRouter._
import react.xml.XmlToCreatElement
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

import reduxForm._
import reduxForm.ReduxForm._

@JSExport("App3")
object Index extends JSApp {

  override def main() {
   
 

    @XmlToCreatElement(true)
    val router = <Router history={ browserHistory }>
                   <Route path="/" component={ App1 }>
                    
                     <Route path="/boostrapComponents" component={ BoostrapComponents }>
                       <Route path="/boostrapComponents/buttons" component={ Buttons }/>
                       <Route path="/boostrapComponents/menus" component={ Menus }/>
                       <Route path="/boostrapComponents/modal" component={ ModalSample }/>
                       <Route path="/boostrapComponents/tooltips" component={ Tooltips }/>
                       <Route path="/boostrapComponents/navigation" component={ Navigation }/>
                       <Route path="/boostrapComponents/pageLayout" component={ PageLayout }/>
                       <Route path="/boostrapComponents/forms" component={ Forms }/>
                       <Route path="/boostrapComponents/mediaContent" component={ MediaContent }/>
                       <Route path="/boostrapComponents/miscellaneous" component={ Miscellaneous }/>
                     </Route>
                   </Route>
                 </Router>

    ReactDOM.render(router, document.getElementById("content"));

  }

} 
 
