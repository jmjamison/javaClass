﻿var evalkit_loaded=0,evalkit_issafari=-1!==navigator.userAgent.indexOf("Safari")&&(-1===navigator.userAgent.indexOf("Chrome")||navigator.userAgent.indexOf("Chrome")>-1&&navigator.userAgent.indexOf("OPR")>-1),EvaluationKIT={onLoad:function(){if(!(window.location.href.indexOf("sessionless_launch")>-1||0===$("#dashboard").length&&0===$(".context_external_tool_"+evalkit_setup.auth_external_tool_id).length&&0===this.getPageCourseId()&&-1===document.location.href.indexOf("/profile")||(evalkit_loaded+=1)>3)){var e=this.getTokenCookie(),t=this.getVerifyCookie();0===e.length||t!==ENV.current_user_id?this.onLti():this.onUser(e)}},onLti:function(){this.startInit(function(){(EvaluationKIT||{}).onAuth()})},startInit:function(e){var t=this,o=t.getInitCookie();null!==o&&!1===o||(null===o||!0!==o?$.get("/api/v1/users/self/profile",function(o){if(o.login_id.length>0){var n=t.getPageCourseId();n>0?$.get("/api/v1/courses/"+n,function(n){n.id>0?t.onAuthInit(o.id,o.login_id,n.id,n.course_code,e):t.setInitCookie(!1)}):t.onAuthInit(o.id,o.login_id,0,"",e)}else t.setInitCookie(!1)}):e())},onAuthInit:function(e,t,o,n,i){var a=this;$.get(evalkit_setup.account_url+"/Canvas/InitCheck?authId="+evalkit_setup.auth_external_tool_id+"&username="+encodeURIComponent(t)+"&userid="+e+"&coursecode="+encodeURIComponent(n)+"&courseid="+o+"&refer="+encodeURIComponent(window.location.pathname+window.location.search)+"&nocache="+(new Date).getTime(),function(e){a.setInitCookie(e.result),!1!==e.result&&i()})},onAuth:function(){var e=this.createCORSRequest("GET","/api/v1/accounts/"+evalkit_setup.account_id+"/external_tools/sessionless_launch?launch_type=user_navigation&url="+encodeURIComponent(evalkit_setup.service_url+"/canvas/authlti"));e&&(e.onload=function(){if(200===e.status){var t=$.parseJSON(e.responseText.replace("while(1);",""));$("#evalkit-lti").length>0?$("#evalkit-lti").attr("src",t.url):$('<iframe src="'+t.url+'" id="evalkit-lti" style="display:none;"></iframe>').appendTo($("body"))}else{(EvaluationKIT||{}).onLoad()}},e.send())},onLtiResponse:function(e){if(null!==e.origin&&(-1!==e.origin.toLowerCase().indexOf(evalkit_setup.service_url)||-1!==e.origin.toLowerCase().indexOf(evalkit_setup.account_url))&&null!==e.data&&void 0!==e.data.length){var t=EvaluationKIT||{},o=JSON.parse(e.data);if(null!==o)switch(o.subject){case"evalkit.location":window.top.location.href=o.url;break;case"evalkit.ltiresponse":var n=o.token;0===n.length&&(n="-1"),t.setTokenCookie(n),t.setVerifyCookie(ENV.current_user_id),t.onLoad()}else console.log("DEBUG: onLtiResponse - jsondata error")}},onUser:function(e){"-1"!==e&&this.startInit(function(){var t=EvaluationKIT||{},o=t.getPageCourseId();if(null===document.getElementById("ek_css")){var n=document.createElement("link");n.setAttribute("id","ek_css"),n.setAttribute("rel","stylesheet"),n.setAttribute("type","text/css"),n.setAttribute("href",evalkit_setup.account_url+"/scripts/canvas/style.min.css"),document.getElementsByTagName("head")[0].appendChild(n)}if(0===o)t.getUserSettings(e,o,"");else{var i="/api/v1/courses/"+o,a=t.createCORSRequest("GET",i);if(!a)return;a.onload=function(){var t="";try{t=$.parseJSON(a.responseText).course_code}catch(e){newobjerrnfo.onError(e)}(EvaluationKIT||{}).getUserSettings(e,o,t)},a.onerror=function(e){var t=EvaluationKIT||{};t.onError(e),t.onLoad()},a.send()}})},getUserSettings:function(e,t,o){var n=this.createCORSRequest("GET",evalkit_setup.service_url+"/canvas/usersettings?token="+encodeURIComponent(e)+"&userid="+ENV.current_user_id+(t>0?"&courseid="+t+"&coursecode="+encodeURIComponent(o)+"&courseTitle=":"")+"&refer="+encodeURIComponent(window.location.pathname+window.location.search)+"&nocache="+(new Date).getTime());n&&(n.onload=function(){if(401===n.status)(EvaluationKIT||{}).onLti();else try{var e=$.parseJSON(n.responseText),o=EvaluationKIT||{};o.onPopup(e),o.onWidget(e),o.onLinks(e,t),$(document).on("click",".ek-sessionless",function(e){var t=$(this).attr("href");evalkit_issafari?t=$(this).data("safariurl"):e.preventDefault();var o=(EvaluationKIT||{}).createCORSRequest("GET",t);o&&(o.onload=function(){if(200===o.status){var e=$.parseJSON(o.responseText.replace("while(1);",""));if(void 0!==e.url&&null!==e&&e.url.length>0)ek_modal.open({iframelink:e.url,buttons:null,iframeheight:800,cssclass:"evalkit-modal-lg",showClose:!0,type:"notification"});else(EvaluationKIT||{}).onLti()}else{(EvaluationKIT||{}).onLti()}},o.send())})}catch(e){(EvaluationKIT||{}).onError(e)}},n.onerror=function(e){var t=EvaluationKIT||{};navigator.appVersion.indexOf("MSIE 10")>-1||navigator.appVersion.indexOf("MSIE 9")>-1?t.onLti():t.onError(e)},n.send())},onPopup:function(e){if(!0===e.popup.visible){var t=[],o=document.createElement("a");if(o.innerHTML=e.popup.gotosurveytext,e.popup.gotosurveyurl.indexOf("sessionless_launch")>-1?(o.setAttribute("class","Button Button--primary ek-widget-btn-primary ek-sessionless"),evalkit_issafari?(o.setAttribute("href",evalkit_setup.account_url+"/MyEval/CookieSet.aspx"),o.setAttribute("data-safariurl",e.popup.gotosurveyurl),o.setAttribute("target","_blank")):o.setAttribute("href",e.popup.gotosurveyurl)):(evalkit_issafari&&(e.popup.gotosurveyurl=evalkit_setup.account_url+"/MyEval/SafariRedirect.aspx?ret="+encodeURIComponent(window.location.origin+e.popup.gotosurveyurl)),o.setAttribute("class","Button Button--primary ek-widget-btn-primary"),o.setAttribute("href",e.popup.gotosurveyurl)),t[0]=o,e.popup.remindlater){var n=document.createElement("a");n.innerHTML=e.popup.remindlatertext,n.setAttribute("href","#"),n.setAttribute("class","Button ek-widget-btn-default"),!0===e.popup.incrementDefer?n.onclick=function(t){t.preventDefault(),ek_modal.close();var o=EvaluationKIT||{};$.get(evalkit_setup.service_url+"/canvas/Defer?token="+encodeURIComponent(o.getTokenCookie())+"&projectId="+e.popup.projectId+"&courseId="+e.popup.courseId+"&nocache="+(new Date).getTime())}:n.onclick=function(e){e.preventDefault(),ek_modal.close()},t[1]=n}ek_modal.open({title:e.popup.header,body:e.popup.body,buttons:t,showClose:!1,type:!0===e.popup.blockPage?"blocker":"notification"})}},onWidget:function(e){$(".ek-widget").remove(),$(e.widget).appendTo("#right-side"),evalkit_issafari&&null!=e.widget&&$(".ek-widget a").each(function(e){var t=$(this);t.hasClass("ek-sessionless")?(t.attr("data-safariurl",t.attr("href")),t.attr("href",evalkit_setup.account_url+"/MyEval/CookieSet.aspx"),t.attr("target","_blank")):t.attr("href",evalkit_setup.account_url+"/MyEval/SafariRedirect.aspx?ret="+encodeURIComponent(window.location.origin+$(this).attr("href")))})},onLinks:function(e,t){$("a.context_external_tool_"+evalkit_setup.auth_external_tool_id).remove(),this.setLink(e.userlink,t),this.setLink(e.studentlink,t),this.setLink(e.instructorlink,t),this.setLink(e.adminlink,t)},createCORSRequest:function(e,t){try{var o=new XMLHttpRequest;return"withCredentials"in o?o.open(e,t,!0):"undefined"!=typeof XDomainRequest?(o=new XDomainRequest).open(e,t):o=null,o}catch(e){this.onError(e)}},getPageCourseId:function(){return void 0!==$("body").attr("class")&&$("body").attr("class").match(/\bcontext-course_(.[0-9]*)/)?parseInt($("body").attr("class").match(/\bcontext-course_(.[0-9]*)/)[1]):0},getPageUserId:function(){return $("body").attr("class").match(/\bcontext-user_(.[0-9]*)/)?$("body").attr("class").match(/\bcontext-user_(.[0-9]*)/)[1]:""},getTokenCookie:function(){return evalkit_readCookie("evalkit_token_"+evalkit_setup.auth_external_tool_id)||""},setTokenCookie:function(e){evalkit_createCookie("evalkit_token_"+evalkit_setup.auth_external_tool_id,e)},getVerifyCookie:function(){return evalkit_readCookie("evalkit_verify_"+evalkit_setup.auth_external_tool_id)||""},setVerifyCookie:function(e){evalkit_createCookie("evalkit_verify_"+evalkit_setup.auth_external_tool_id,e)},getInitCookie:function(){var e=evalkit_readCookie("evalkit_init_verfiy_"+evalkit_setup.auth_external_tool_id);if(null!==e&&""!==e||(e=-1),-1!==e&&e!==ENV.current_user_id)return evalkit_createCookie("evalkit_init_verfiy_"+evalkit_setup.auth_external_tool_id,ENV.current_user_id),evalkit_createCookie("evalkit_init_"+evalkit_setup.auth_external_tool_id,""),null;var t=evalkit_readCookie("evalkit_init_"+evalkit_setup.auth_external_tool_id);if(null===t||""===t)return null;var o=this.getSection();if(null===o)return!1;for(var n=JSON.parse(t),i=0;i<n.length;i++)if(n[i].section==o)return n[i].val;return null},setInitCookie:function(e){var t=evalkit_readCookie("evalkit_init_"+evalkit_setup.auth_external_tool_id);null!==t&&""!==t||(t="");var o=this.getSection();if(null!==o){for(var n=0===t.length?[]:JSON.parse(t),i=!1,a=0;a<n.length;a++)n[a].section==o&&(i=!0,n[a].val=e);!1===i&&n.push({section:o,val:e}),evalkit_createCookie("evalkit_init_verfiy_"+evalkit_setup.auth_external_tool_id,ENV.current_user_id),evalkit_createCookie("evalkit_init_"+evalkit_setup.auth_external_tool_id,JSON.stringify(n))}},getSection:function(){var e=null;if($("#dashboard").length>0)e="dashboard";else if(document.location.href.indexOf("/profile")>-1)e="profile";else{var t=this.getPageCourseId();t>0&&(e=t)}return e},setLink:function(e,t){if(null!==e&&0!==e.exttoolid){var o=$("a.context_external_tool_"+e.exttoolid);if(2!=e.linktype||0!==this.getPageUserId().length){if(2==e.linktype&&this.getPageUserId().length>0){if(!e.visible)return void o.parent().remove();0===o.length?$("<li class='section evalkitlink'><a style='display:block !important;' class='evalkituser context_external_tool_"+e.exttoolid+"' href='/users/"+ENV.current_user_id+"/external_tools/"+e.exttoolid+"'>"+e.title+"</a></li>").appendTo("#section-tabs"):o.attr("style","display:block !important;")}else if(t>0){if(!e.visible)return void o.parent().remove();0===o.length?$("<li class='section evalkitlink'><a style='display:block !important;' class='evalkitcourse context_external_tool_"+e.exttoolid+"' href='/courses/"+t+"/external_tools/"+e.exttoolid+"'>"+e.title+"</a></li>").appendTo("#section-tabs"):(o.attr("style","display:block !important;"),o.innerHTML=e.title)}(o=$("a.context_external_tool_"+e.exttoolid)).addClass("evalkit-ltilink"),o.length>0&&(null!==e.badge&&$('<b class="nav-badge evalkit-badge">'+e.badge+"</b>").prependTo(o),evalkit_issafari&&o.attr("href",evalkit_setup.account_url+"/MyEval/SafariRedirect.aspx?ret="+encodeURIComponent(window.location.origin+o.attr("href"))))}}},onError:function(e){console.log("EvaluationKIT Canvas User Integration Error: "+e),console.log("EvaluationKIT Canvas User Integration Error Stack: "+e.stack)}};$(document).ready(function(){var e=EvaluationKIT||{};window.addEventListener?window.addEventListener("message",e.onLtiResponse,!1):window.attachEvent("onmessage",e.onLtiResponse),e.onLoad()});var ek_modal=function(){var e,t,o,n,i,a,l={};(e=document.createElement("div")).id="ek-overlay",e.style.display="none",(t=document.createElement("div")).id="ek-modal",t.style.display="none",t.setAttribute("role","dialog"),t.setAttribute("tabindex","-1"),t.setAttribute("aria-live","assertive"),t.setAttribute("aria-labelledby","ek-modal-header");var r=document.createElement("div");return r.setAttribute("class","ek-modal-content"),(o=document.createElement("h2")).setAttribute("class","ek-modal-header"),o.id="ek-modal-header",(a=document.createElement("a")).setAttribute("id","ek-modal-close"),(n=document.createElement("div")).setAttribute("class","ek-modal-body"),n.setAttribute("id","ek-modal-body"),(i=document.createElement("div")).setAttribute("class","ek-modal-footer"),r.appendChild(o),r.appendChild(a),r.appendChild(n),r.appendChild(i),t.appendChild(r),l.open=function(l){if(null!==l){if(void 0!==l.cssclass&&null!==l.cssclass&&t.setAttribute("class",l.cssclass),n.innerHTML="",void 0!==l.iframelink&&null!==l.iframelink&&l.iframelink.length>0?(n.innerHTML='<iframe id="ek-modal-iframe-loading"></iframe><iframe src='+l.iframelink+' id="ek-modal-iframe" style=\'display:none;\' onload="evalkit_modal_iframe();"></frame>',window.removeEventListener("resize",evalkit_modal_iframe_resize),window.addEventListener("resize",evalkit_modal_iframe_resize),evalkit_modal_iframe_resize(),document.getElementById("ek-modal-close").style.display="",document.getElementById("ek-modal-iframe-loading").contentWindow.document.write('<html><head></head><body style="text-align:center;"><img src="'+evalkit_setup.account_url+'/Media/Images/loadingd2l.gif" style="padding-top:10%;" /></body></html>')):n.innerHTML=l.body,void 0!==l.title&&null!==l.title?(o.innerHTML=l.title,o.style.display=""):o.style.display="none",e.setAttribute("class","ek-overlay-"+l.type),"blocker"==l.type){var r=window.getComputedStyle(document.getElementById("header"),null).getPropertyValue("background-color");0===r.length&&(r="rgb(57, 75, 88)"),e.style.background=r}else e.style.background="";if(t.setAttribute("oncontextmenu","return false"),e.setAttribute("oncontextmenu","return false"),e.style.display="",t.style.display="",t.setAttribute("data-type",l.type),window.scrollTo(0,0),$("body").addClass("ek-modal-open"),setTimeout(function(){$("body").removeClass("ek-modal-open")},2e3),void 0!==l.buttons&&null!==l.buttons&&l.buttons.length>0){i.innerHTML="";for(var s=0;s<l.buttons.length;s++)0===s&&l.buttons[s].focus(),i.appendChild(l.buttons[s]);i.style.display=""}else i.innerHTML="",i.style.display="none";!0!==l.showClose&&(a.style.display="none"),!0===l.refreshOnClose?a.onclick=function(e){$(document).keypress(function(e){if(27==e.keyCode)return e.preventDefault(),!1}),ek_modal.close(),document.location.href=document.location.href}:a.onclick=function(e){ek_modal.close()}}else console.log("ek_modalopen settings === null")},l.close=function(){$("body").removeClass("ek-modal-open"),e.style.display="none",t.style.display="none",n.innerHTML=""},document.body.appendChild(e),document.body.appendChild(t),l}();function evalkit_modal_iframe(e){var t=document.getElementById("ek-modal-iframe"),o=document.getElementById("ek-modal-iframe-loading");t.style.display="",o.style.display="none"}function evalkit_modal_iframe_resize(){var e=document.getElementById("ek-modal-iframe");null!==e&&e.setAttribute("height",window.innerHeight-180);var t=document.getElementById("ek-modal-iframe-loading");null!==t&&t.setAttribute("height",window.innerHeight-180)}function evalkit_createCookie(e,t){var o=new Date,n=Date.UTC(o.getFullYear(),o.getMonth(),o.getDate(),o.getHours(),o.getMinutes(),o.getSeconds(),o.getMilliseconds());sessionStorage.setItem(e+"_E",n),sessionStorage.setItem(e,t)}function evalkit_readCookie(e){var t=sessionStorage.getItem(e+"_E");if(null==t)return sessionStorage.removeItem(e),null;var o=new Date;return Date.UTC(o.getFullYear(),o.getMonth(),o.getDate(),o.getHours(),o.getMinutes(),o.getSeconds(),o.getMilliseconds())-t>18e5?(sessionStorage.removeItem(e+"_E"),sessionStorage.removeItem(e),null):sessionStorage.getItem(e)}