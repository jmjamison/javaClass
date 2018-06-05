/* Stock file for use as Canvas global javascript file

This file HIDES:
For all users
- Delete My Account

For teachers all pages:
- Commons

For teachers Settings page:
- Reset Course Content
- Conclude this Course
- Import Content into this Course
- Export Course Content
- Permanently Delete this Course
- Navigation (Settings tab)
- Apps (Settings tab)
- Visibility options

For teachers Home page:
- Next Steps wizard
- Unpublished reminder

For teachers Modules page:
- Import content button on blank modules

For Students:
- Breadcrumb trail
- Design Tools Upload/Embed widget

This file ADDS:
For all users Navigation menus:
- EvaluationKit

For Admins:
- Admin menu button
- Destiny button
- Zendesk button

For Teachers:
- Instructor Portal

This file CHANGES:
For all users:
- notification text for users with no active courses

Last update: February 2018
*/

////////////////////////////////////////////////////
// DESIGN TOOLS CONFIG                            //
////////////////////////////////////////////////////
// Copyright (C) 2016  Utah State University
var DT_variables = {
        iframeID: '',
        // Path to the hosted USU Design Tools
        path: 'https://designtools.ciditools.com/',
        templateCourse: '12452',
        // OPTIONAL: Button will be hidden from view until launched using shortcut keys
        hideButton: false,
        // OPTIONAL: Limit tools loading by users role
        limitByRole: true, // set to true to limit to roles in the roleArray
        // adjust roles as needed
        roleArray: [
            //'student',
            //'teacher',
            'admin'
        ],
        // OPTIONAL: Limit tools to an array of Canvas user IDs
        limitByUser: false, // Change to true to limit by user
        // add users to array (Canvas user ID not SIS user ID)
        userArray: [
            '1234',
            '987654'
        
        ]
    };

// Run the necessary code when a page loads
$(document).ready(function () {
    'use strict';
    // This runs code that looks at each page and determines what controls to create
    $.getScript(DT_variables.path + 'js/master_controls.js', function () {
        console.log('master_controls.js loaded');
    });
});
////////////////////////////////////////////////////
// END DESIGN TOOLS CONFIG                        //
////////////////////////////////////////////////////


/*EvaluationKIT START*/
var evalkit_jshosted = document.createElement('script');
evalkit_jshosted.setAttribute('type', 'text/javascript');
evalkit_jshosted.setAttribute('src', 'https://uclaextension.evaluationkit.com/CanvasScripts/uclaextension.js?v=13');
document.getElementsByTagName('head')[0].appendChild(evalkit_jshosted);
/*EvaluationKIT END*/


// change courses page when user has no active courses
$(".notification_message:contains('You don't have any courses, so this page won't be very exciting for now.')").html('Courses are available two days before the course start date after 1:00 AM Pacific Time. To view current and upcoming courses, please click on Courses > All Courses.')
//$(".ic-Action-header__Secondary:contains('You are not enrolled in any courses.')").html('Cut&Paste')

//var currentLocation = window.location.pathname;

//console.log("Hello World.");
//console.log(currentLocation);


function addMenuItem (linkText, linkhref, icon, target) {    
	var iconHtml = '',    
		itemHtml,    
		linkId = linkText.split(' ').join('_'),  
		newTab = '';  
	if (typeof target !== 'undefined') {  
		newTab = 'target="' + target + '"';  
		}  
	if (icon !== '') {    
		iconHtml = '<i class="' + icon + '"></i> ';    
		}    
	itemHtml = '<li class="ic-app-header__menu-list-item ">' +    
		'  <a id="global_nav_' + linkId + '" href="' + linkhref + '" class="ic-app-header__menu-list-link" ' + newTab + '>' +    
		' <div class="menu-item__text">' + iconHtml + linkText + '</div>' +    
		'  </a>' +    
		'</li>';    
	$('#menu').append(itemHtml);    
}


$(function() {

    var docUrl = document.URL; // Get the page URL once, for use multiple times  

    // Changes for all users go below this line ----------------------------------------------

    // Alter the user profile page
    if (docUrl.indexOf("about") > 0 || docUrl.indexOf("profile") > 0) {
        $("a:contains('Delete My Account')").hide();
    }



    // End of changes for all users ---------------------------------------


    // Loop thru user roles provided by Canvas ENV object    
    var isAdmin = false;
    var isTeacher = false;
    // var isStudent = false;
    for (var i = ENV.current_user_roles.length - 1; i > -1; i--) {
        switch (ENV.current_user_roles[i]) {
            case 'admin':
                isAdmin = true;

                // Admin-only changes go below this line  -----------------------------
                    if (docUrl.indexOf("settings") > 0) {
                        $("a:contains('Delete this Course')").css('outline','1px solid red');
                        $("a:contains('Conclude this Course')").css('outline','1px solid red');
                        $("a:contains('Copy this Course')").css('outline','1px solid red');
                        $("a:contains('Import Course Content')").css('outline','1px solid red');
                        $("a:contains('Export Course Content')").css('outline','1px solid red');
                        $("a:contains('Reset Course Content')").css('outline','1px solid red');
                        $("a:contains('Apps')").css('outline','1px solid red');
                        $("a:contains('Navigation')").css('outline','1px solid red');
                        $("a:contains('Feature Options')").css('outline','1px solid red');
                        $("a:contains('Permanently Delete this Course')").css('outline','1px solid red');
                    }

                    // To verify if on Home page
                    var idx = docUrl.indexOf("courses/") + "courses/".length;
                    var temp = docUrl.substring(idx);
                    var idx2 = temp.indexOf("/");

                    // Changes to Home page
                    if (idx2 < 0 || idx2 == temp.length - 1) {
                        $("a:contains('Course Setup Checklist')").css('outline','1px solid red');
                    }


				// Adds an Admin button to the menu
                //$("#menu").append("<li id='admincustom_menu_item' class='menu-item'> <a href='/accounts/self' class='menu-item-no-drop'>Admin</a></li>");
				
addMenuItem('IDLS Admin', '/accounts/self', '');
addMenuItem('Destiny', 'https://uclasv.destinysolutions.com', '', '_blank');
addMenuItem('Zendesk', 'https://unexonline.zendesk.com', '', '_blank');


                // End of Admin-only changes -------------------------------
                break;
                
            case 'teacher':
                isTeacher = true;
                if (!isAdmin) {

                    // Teacher-only changes go below this line ----------------------------
                    
                    //addMenuItem('Instructor Portal', 'https://www.uclaextension.edu/portal/logonInstructor.do?method=load', '', '_blank');


					//$("a:contains('Commons')").hide();
					$("a:contains('Share to Commons')").hide();
					
                    // Changes to Settings page 
                    if (docUrl.indexOf("settings") > 0) {
                        $("a:contains('Reset Course Content')").hide();
                        $("a:contains('Conclude this Course')").hide();
                        $("a:contains('Import Course Content')").hide();
                        $("a:contains('Export Course Content')").hide();
                        $("a:contains('Navigation')").hide();
                        $("a:contains('Apps')").hide();
                        $("a:contains('Feature Options')").hide();
                        $("a:contains('Permanently Delete this Course')").hide();
						
						//The following removes the option to make a course public. 
						$('#course_visibility').hide();
					}	
						
						
					if (docUrl.indexOf("modules") > 0) {
						//The following removes the option to import content from modules. 
						document.getElementsByClassName("ic-EmptyStateButton")[1].style.visibility='hidden';
                    }

					// To verify if on Home page
					var idx = docUrl.indexOf("courses/") + "courses/".length;
					var temp = docUrl.substring(idx);
					var idx2 = temp.indexOf("/");

					// Changes to Home page
					if (idx2 < 0 || idx2 == temp.length - 1) {
                        $("a:contains('Course Setup Checklist')").hide();
                        // $("a:contains('Choose Home Page')").hide();
                        //The following removes the option to import content from modules. 
						document.getElementsByClassName("ic-EmptyStateButton")[1].style.visibility='hidden';
                        
                        // Hides the reminder that the course needs to be published box. Leaves a white space - needs some cleaning up
						document.getElementsByClassName('reminder')[0].style.visibility='hidden';
                        
                        // Hides the Next Steps box after one second
                    	setTimeout(function(){
                    		$('#wizard_box').hide();}, 1000);
                    	
                    	//console.log("Home");
                    }


                    // End of Teacher-only changes -------------------------
                }
                break;
                
                
        }
        if (isTeacher) break; // Exit the loop early, to avoid checking the remaining roles
    }


    if (!isAdmin && !isTeacher) {
        // Student-only ----------------------------------------------------

        // ... student only actions here

        $('#breadcrumbs').hide();

	// Hide Upload/Embed Image tool if tools are limited for this user
	var uploadEmbedPosition = '';
		if (INST !== undefined && INST.editorButtons !== undefined) {
			$.each(INST.editorButtons, function(index, val) {
				if (val.name === 'Upload/Embed Image') {
					uploadEmbedPosition = index;
				}
			});
			if (uploadEmbedPosition !== '') {
				INST.editorButtons.splice(uploadEmbedPosition, 1);
			}
		};
        
        //document.getElementsByClassName("ic-app-main-content__secondary")[0].style.visibility='hidden';

        // End of Student-only changes -------------------------------------
    }


});

//In Google Analytics you'll need to set up custom dimensions as follows
// Custom Dimension 1 = Canvas User ID --- Scope = User
// Custom Dimension 2 = Archived --- Scope = User
// Custom Dimension 3 = Canvas User Role --- Scope = User
// Custom Dimension 4 = Canvas Course ID --- Scope = Hit
// Custom Dimension 5 = Canvas Course Name --- Scope = Hit
// Custom Dimension 6 = Canvas Sub-Account ID --- Scope = Hit

(function (i, s, o, g, r, a, m) {
    i['GoogleAnalyticsObject'] = r;
    i[r] = i[r] || function () {
        (i[r].q = i[r].q || []).push(arguments)
    }, i[r].l = 1 * new Date();
    a = s.createElement(o),
    m = s.getElementsByTagName(o)[0];
    a.async = 1;
    a.src = g;
    m.parentNode.insertBefore(a, m)
})(window, document, 'script', 'https://www.google-analytics.com/analytics.js', 'ga');

$(document).ready(function () {

    // START - More Google Analytics Tracking Code
    var sUserId
    var sUserRole
    var sTemp // Course ID from URL
    var _course
    var sCourseName = null
    var parent_account //Give you the subaccount_id that the course is in

////////////////// CHANGE UA # HERE /////////////////////
    ga('create', 'UA-63040720-1', 'auto');

    //Get User Information
    sUserId = ENV["current_user_id"]
    ga('set', 'dimension1', sUserId);


    //Get User Role
    if ($.inArray('admin', ENV['current_user_roles']) == -1 && $.inArray('teacher', ENV['current_user_roles']) == -1 && $.inArray('student', ENV['current_user_roles']) > -1) {
        sUserRole = "student"
    } else if ($.inArray('admin', ENV['current_user_roles']) == -1 && $.inArray('teacher', ENV['current_user_roles']) > -1) {
        sUserRole = "teacher"
    } else if ($.inArray('admin', ENV['current_user_roles']) > -1) {
        sUserRole = "admin"
    } else {
        sUserRole = "other"
    }

    ga('set', 'dimension3', sUserRole);

    //If the user is in a course
    try {
        sTemp = window.location.pathname.match(/\/courses\/(\d+)/);
        if (sTemp[1]) {

            //Get Course information - Course Name and parent sub-account id
            var d1 = $.get('/api/v1/courses/' + sTemp[1], function (_course) {
                parent_account = _course.account_id
                parent_account = parent_account.toString();
                sCourseName = _course.name
            });


            $.when(d1).done(function (_account) {
                // ...do stuff...
                ga('set', 'dimension4', sTemp[1]);
                ga('set', 'dimension5', sCourseName);
                ga('set', 'dimension6', parent_account);
                ga('send', 'pageview');
            });
        } else {
            ga('send', 'pageview');
        }
    } catch (err) {}

    // END - Google Analytics Tracking Code

});