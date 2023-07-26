import { Directive } from "@angular/core";
import { ElementRef } from "@angular/core";

@Directive({
    selector: '[addColor]'
})

export class AddColorDirective {
    constructor(private elementRef: ElementRef) {
        this.elementRef.nativeElement.style.backgroundColor = 'red';
    }

    addColors(col: string) {
    }

}