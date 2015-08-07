if (!org) var org = {};
if (!org.tsn) org.tsn = {};
if (!org.tsn.common) org.tsn.common = {};
if (!org.tsn.common.AccountCommon)
{
	org.tsn.common.AccountCommon = function()
	{
		var my	= {};
		 
		my.setMenuSelection = function(menuName)
		{
		 	$('li#home-nav').removeClass('active');
		 	$('li#accounts-nav').removeClass('active');
		 	$('a#profile-nav').removeClass('active');
		 	$('li#planning-nav').removeClass('active');
		 	$('li#site-map-nav').removeClass('active');
			$('#contact-us-nav').removeClass('active');
			$('#mobile-selected-menu-item').text(menuName);
		 	if($('li#transactions-nav').length > 0)
		 	{
		 		$('li#transactions-nav').removeClass('active');
		 	}
		 	if(menuName == 'HOME')
	 		{
		 		$('li#home-nav').addClass('active');
	 		} 
		 	else if(menuName == 'ACCOUNTS')
	 		{
		 		$('li#accounts-nav').addClass('active');
	 		}
		 	else if(menuName == 'PROFILE')
	 		{
		 		$('a#profile-nav').addClass('active');
	 		}
		 	else if(menuName == 'TRANSACTIONS')
	 		{
		 		$('li#transactions-nav').addClass('active');
	 		}
		 	else if(menuName == 'PLANNING')
	 		{
		 		$('li#planning-nav').addClass('active');
	 		}
		 	else if(menuName == 'INVESTMENTS')
	 		{
		 		$('li#investments-nav').addClass('active');
	 		}
		 	else if(menuName == 'SITEMAP')
	 		{
		 		$('li#site-map-nav').addClass('active');
	 		}
		 	else if(menuName == 'CONTACTUS')
		 	{
		 		$('#contact-us-nav').addClass('active');
		 	}
		};
		
 		my.loadAboutYourPlan = function(planNumber)
		{	
			webanalytics.trackLink('planning~about-your-plan',document.URL);
			var accountKey = "RPS_" + planNumber;
			my.switchPlan("/participant/account-planning-about-your-plan","SITEMAP","ABOUT_YOUR_PLAN", accountKey);
		};
 		
		//BENE start
		my.switchPlan = function (pageKey, launchPage, targetPage, accountKey, callback) {
			var planNumber = accountKey.substring(4);

			$.ajax(
					{
						url: getJunction()+'/participants/updateSessionServlet/action',
						type: "Post",
						data:{
							key:"switchPlan",
							planNumber: planNumber
						},
						async: true,
						cache: false,
						success: function( data )
						{
							if(typeof(callback) == "function"){
								try{
									callback();
								}
								catch(e){
									console.log(e);
								}
							}
							else{
								AccountCommon.loadSelectedPage(pageKey,launchPage,targetPage, accountKey);
							}

						},
						error: function( xhr, textStatus, errorThrown )
						{
							window.scrollTo(1,1);	
						}
					}
				);
		};
		//BENE end
 
		
		my.callAjax = function(url, data, divContent, callback, dataType, methodType, asyncCall, cacheResp)
		{
			if(typeof asyncCall == 'undefined' || asyncCall == null)
			{
				asyncCall = true;
			}
			if(typeof cacheResp == 'undefined' || cacheResp == null)
			{
				cacheResp = false;
			}
			if(typeof dataType == 'undefined' || dataType == null)
			{
				dataType = "html";
			}
			if(typeof methodType == 'undefined' || methodType == null)
			{
				methodType = 'POST';
			}
			$.ajax(
					{
						url: url,
						dataType: dataType,
						async: asyncCall,
						cache: cacheResp,
						data: data,
						type: methodType,
						success: function( data )
						{
							if(divContent && divContent.length > 0)
							{
								var divObjId = "#"+divContent;
								$(divObjId).html(data);
							}
							if(callback) eval(callback);
						},
						error: function( xhr, textStatus, errorThrown )
			    		{
							com.trp.rws.account.common.Core.log(xhr);
			    		}
					}
				);
		};
		 
		my.registerBeneficiary = function(){
			my.viewBeneToggle();
			$('#update_bene_btn').on('click', function(){
				webanalytics.trackLink('accounts~profile~updateBeneficiaryBtn', document.URL);
				
				$(this).find('i').attr('class', 'data-loading-btn');
				$(this).prop('disabled', true);
				AccountCommon.switchPlan('/participant/beneficiary-info','PROFILE','BENEFICIARY',my.accountKey);
			});
			
		};		
		 
		return my;
	}();
	AccountCommon = org.tsn.common.AccountCommon;
};

  
