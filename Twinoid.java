	static int isTwinoid(int[] a){
		int evenCounter = 0, twinCounter = 0;
		if(a.length < 2) return 0;
		for(int i = 0; i < a.length; i++){
			if(a[i] % 2 == 0){
				evenCounter++;
			}else{
				if(evenCounter == 2){
					twinCounter++;
					evenCounter = 0;
				}else if(evenCounter > 2){
					return 0;
				}else{
					evenCounter = 0;
				}
			}
			if(twinCounter > 1) return 0;
		}
		if(evenCounter == 2){
			twinCounter++;
		}
		if(evenCounter > 2) return 0;
		if(twinCounter == 1) return 1;
		return 0;
	}